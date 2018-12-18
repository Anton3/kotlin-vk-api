# kotlin-vk-api
[![All Contributors](https://img.shields.io/badge/all_contributors-2-orange.svg?style=flat-square)](#contributors)

API ВКонтакте сгенерированное на основе [схемы](https://github.com/VKCOM/vk-api-schema) с исправленными ошибками c поддержкой корутин.

Gradle:
```
repositories {
    maven {
        url  "https://dl.bintray.com/alatushkin/maven"
    }
}
...
dependencies {
        implementation("name.alatushkin.utils:kotlin-vk-api:0.1")
    }
```

Пример вызова метода:
```
val userAccessToken = "sooo_secret
val httpClient = httpClient()
val api = MethodExecutorImpl(httpClient).withToken(userAccessToken)

val (response,error) = api(WallGetMethod(domain = "departureMsk"))
println(response)
println(error)
```

Выполнение до 25 одинаковых методов за один вызов:
```
val methodFactory = { page: Long -> WallGetMethod(domain = "departureMsk",offset = page,count = 100)}
val result: Array<VkList<WallpostFull>> = api((0..24L).map(methodFactory))
```
Под капотом генерируется код на VKScript и выполняется через метод "execute". В документации VK отмечается, что API методов внутри VKScript может не совпадать с внешним API. Так что всегда есть шанс, что для каких-то методов универсальный генератор работать не будет. Если встретитесь с таким - заведите isssue с подробностями.


Особенности кода:
API устроен таким образом, что один и тот же метод может возвращать объекты рахных типов, в зависимости от переданных параметров. При этом хочется типизации и не хочется null-checking (some?.nullableParam).

В таких случаях для одного api-endpoint сгенерировано 2 (более методов) с соответсвующими суффиксами в именовании + жестко заданными знаечниями управляющих параметров.
Для пример:
```
val result:VkResponse<VkList<WallpostFull>> = api(WallGetMethod(domain = "departureMsk"))
val resultExtended:VkResponse<GetExtendedResponse> = api(WallGetMethodExtended(domain = "departureMsk"))
```

## Как внести свой вклад
### Дополнения и исправления в схеме (json)
Т.к. оригинальная схема написана неряшливо, каких-то планов по ее регулярной поддержке не озвучено, то в проекте она хранится в следующем виде:

1. [Оригинальный набор файлов](https://github.com/Anton3/kotlin-vk-api/tree/master/generator/src/main/resources/schema) - сюда принимаются только минорные PR: флаги обязательности полей, потерянные поля, комментарии. Когда ВК обновит своб схему - сделать мерж будет "просто".

2. Набор [патчей](https://github.com/Anton3/kotlin-vk-api/tree/master/generator/src/main/resources/patch) - концептуальные ошибки в объявлении тех или иных методов, необъявленные типы объектов и прочее. Сюда можно присылать PR для отсутсвующих объектов методов и прочее.

### Доработки кодо-генерации
Кодогенерация живет [в отдельном подпроекте](https://github.com/Anton3/kotlin-vk-api/tree/master/generator).

### Доработки сопутствующего кода
Попмимо сгенерированного кода, присутсвует и некая часть вспомогательного кода, который так же нуждается в улучшениях.

Что "нужно" уже сейчас:
1. Доработать кодогенерацию для генерации VK-подобного api  (WallGetMethod => wall.get  с правильными областями видимости, чтобы не засорять неймспейс)
2. Выделить кодо-генерацию и сделать автоматическую сборку через travis-ci при исправлении в json-схеме

Статус - работает "как есть". Те методы который использую в своих проектах - проверены, но вполне могут быть методы в схеме описания которых ошибка из-за чего они могут не работать - заводите issue, прикладывайте PR в схему.

## Авторы

- [@alatushkin](https://github.com/alatushkin) ([email](mailto:alexandr.latushkin@gmail.com), [ВК](https://vk.com/id5518788)) —
автор оригинального репозтория и первоначальной версии API
- [@Anton3](https://github.com/Anton3) ([email](mailto:antony.zhilin@gmail.com), [ВК](https://vk.com/antonyzhilin)) —
автор форка
