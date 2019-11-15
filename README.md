# kotlin-vk-api
[![All Contributors](https://img.shields.io/badge/all_contributors-2-orange.svg?style=flat)](#contributors)
[![Release](https://jitpack.io/v/Anton3/kotlin-vk-api.svg)](https://jitpack.io/#Anton3/kotlin-vk-api)

API ВКонтакте сгенерированное на основе
[схемы](https://github.com/VKCOM/vk-api-schema)
с исправленными ошибками c поддержкой корутин.

На текущий момент поддерживается версия VK API 5.103.
Её нужно указывать в настройках LongPoll и Callback группы.

## Установка

Gradle:

```gradle
repositories {
    jcenter()
    maven(url = "https://jitpack.io")
}

dependencies {
    implementation("com.github.Anton3:kotlin-vk-api:0.11.2")
}
```

## Быстрый старт

Библиотека опирается на `HttpClient` из [Ktor](https://github.com/ktorio/ktor).
Для начала оберните его в один на всё приложение `VkClientFactory`:

```kotlin
import io.ktor.client.HttpClient
import name.anton3.vkapi.client.VkClientFactory
import name.anton3.vkapi.client.ktorClientFactory

val httpClient: HttpClient = TODO()
val clientFactory: VkClientFactory = ktorClientFactory(httpClient)
```

Создайте токен нужного типа и создайте ваш клиент ВК с его помощью:

```kotlin
import name.anton3.vkapi.client.GroupClient
import name.anton3.vkapi.tokens.GroupToken

val api: GroupClient = clientFactory.group(GroupToken(accessToken))
```

> **Замечание.** Клиент учитывает ограничения ВК на запросы к API и объединяет несколько запросов
в один через Execute, когда это возможно. Тип клиента зависит от прав
на выполнение методов. Выполнение метода на клиенте с несовместимым токеном
порождает ошибку на этапе компиляции.

Используйте этот клиент для выполнения всех запросов, подпадающих под один и тот
же лимит запросов ВК:

```kotlin
import name.anton3.vkapi.generated.wall.methods.WallGet
import name.anton3.vkapi.generated.wall.objects.WallpostFull

val response: WallpostFull = api(WallGet(domain = "departureMsk"))
println(response.text)
```

### Обработка ошибок

При выполнении могут выбрасываться различные исключения — наследники
`IOException`:

- Ошибки VK API: `VkAPiException`
- Ошибки соединения: `IOException`
- Ошибки парсинга JSON: `JsonProcessingException`
- Другие ошибки при запросе и парсинге ответа: `IOException`

Где-то на высоком уровне их следует перехватывать и обрабатывать:

```kotlin
while (true) {
    try {
        // Receive commands, make requests
    } catch (e: VkApiException) {
        log.warn("Request failed with code: ${e.vkError.errorCode}", e)
    } catch (e: IOException) {
        log.warn("Connection error: ", e)
    }
}
```

Чтобы «проглотить» ошибки при выполнении какого-то метода, можно
воспользоваться `swallow`:

```kotlin
import name.anton3.vkapi.client.swallow

val response: WallpostFull? = swallow { api(WallGet(domain = "departureMsk")) }
println(response?.text)
```

### LongPoll и Callback

Примеры использования можно найти в:
 
- [`GroupLongPollEventSourceTest`](https://github.com/Anton3/kotlin-vk-api/blob/master/vk-api-methods/src/test/kotlin/name/anton3/vkapi/methods/longpoll/GroupLongPollEventSourceTest.kt)
- [`UserLongPollEventSourceTest`](https://github.com/Anton3/kotlin-vk-api/blob/master/vk-api-methods/src/test/kotlin/name/anton3/vkapi/methods/longpoll/UserLongPollEventSourceTest.kt)
- [`CallbackTest`](https://github.com/Anton3/kotlin-vk-api/blob/master/vk-api-methods/src/test/kotlin/name/anton3/vkapi/methods/callback/CallbackTest.kt)

### Логи

```kotlin
// build.gradle.kts
implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.12.0")
```

В вашей папке `resources` должен быть файл `log4j2.xml`,
[вот пример](https://github.com/Anton3/kotlin-vk-api/blob/master/vk-api-methods/src/test/resources/log4j2.xml).

## Структура библиотеки
Библиотека разбита на следующие модули:

- `vk-api-generator` — генератор кода запросов и ответов из JSON-схемы
- `vk-api-core` — основная часть библиотеки, не зависящая от конкретных методов,
предоставляемых ВК
- `vk-api-generated` — сгенерированные методы и ответы ВК
- `vk-api-methods` — обёртка над `vk-api-generated`. Исправляет сериализацию
некоторых сгенерированных классов, а также предоставляет удобный интерфейс для
таких методов, как Callback API, LongPoll API, Upload
- `vk-api-ktor` — привязка к [Ktor](https://github.com/ktorio/ktor)
- `vk-api-simple` — включает все модули и предоставляет `ktorClientFactory`

Т.к. оригинальная схема написана неряшливо, каких-то планов по ее поддержке
не озвучено, то в проекте она хранится в следующем виде:

1. [Оригинальный набор файлов](https://github.com/Anton3/kotlin-vk-api/tree/master/generator/src/main/resources/schema)
2. [Набор патчей](https://github.com/Anton3/kotlin-vk-api/tree/master/generator/src/main/resources/patch)

## Статус библиотеки
Основная часть библиотеки работает хорошо - уж точно намного лучше, чем
официальная либа. Расширенная поддержка методов в `vk-api-methods` недоработана.

Никаких гарантий по стабильности интерфейса библиотеки на текущий момент
не даётся, поэтому обязательно указывайте точную версию.

## Процесс разработки
Разработка ведётся в ветке `develop`. После прогона нескольких тестов,
новый функционал отправляется в `master`.

## Как внести свой вклад
Для любых ошибок или предложений заводите Issue, будем разбираться. Если есть
желание заняться реализацией, то:
- **Заводим Issue**
- Форкаем репозиторий
- Регистрируем на `jitpack.io`
- Перенаправляем на него свои зависимости от `kotlin-vk-api`
- Создаём на базе `develop` ветку `feature-...`
- Создаём Pull Request
- Кодим и коммитим любые изменения
- Пишем в Issue, что PR #такой-то готов и решает этот Issue
- PR приниимается или отклоняется. Если отклоняется, то вы в любом случае можете
создать Release в своём форке и пользоваться своими изменениями дальше

#### Доработки основного кода библиотеки (`vk-api-core`)

#### Дополнения и исправления в JSON-схеме
Дополнения принимаются или в виде новых небольших патчей для JSON-схемы, или
в виде доработки `vk-api-generator`.

#### Доработки интерфейса методов
Расширенная поддержка методов `vk-api-methods` находится на ранней стадии
разработки. Многое отсутствует. Любая помощь принимается.

## Авторы

- [@alatushkin](https://github.com/alatushkin) ([email](mailto:alexandr.latushkin@gmail.com), [ВК](https://vk.com/id5518788)) —
автор оригинального репозтория и первоначальной версии API
- [@Anton3](https://github.com/Anton3) ([email](mailto:antony.zhilin@gmail.com), [ВК](https://vk.com/antonyzhilin)) —
автор этого форка
