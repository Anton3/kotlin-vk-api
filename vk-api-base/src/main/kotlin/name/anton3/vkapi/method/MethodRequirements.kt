package name.anton3.vkapi.method

/**
 * The method is available with an access token of some (matching) kind.
 * However, the exact types of supported access tokens are unknown.
 *
 * This interface and all derived interfaces should not be implemented by any classes.
 * They allow to statically type-check that a VkClient can execute a given VkMethod.
 */
interface MethodRequirement


/**
 * The method is available for "user" or for "group" (exact requirement is unknown)
 * Or:
 * This token can execute both "user" and "group" requests
 */
interface UserOrGroupMethod : MethodRequirement


/**
 * The method is available at least for "user"
 * Or:
 * This token is a "user" token
 */
interface UserMethod : UserOrGroupMethod

/**
 * The method is available at least for "group"
 * Or:
 * This token is a "group" token
 */
interface GroupMethod : UserOrGroupMethod

/**
 * The method is available at least for "service"
 * Or:
 * This token is a "service" token
 */
interface ServiceMethod : MethodRequirement

/**
 * The method is available at least for "user" and for "group"
 * Or:
 * This token is either a "user" or "group" token (exact type is unknown)
 */
interface UserGroupMethod : UserMethod, GroupMethod

/**
 * The method is available at least for "user" and for "service"
 * Or:
 * This token is either a "user" or "service" token (exact type is unknown)
 */
interface UserServiceMethod : UserMethod, ServiceMethod

/**
 * The method is available at least for "user" and for "group" and for "service"
 * Or:
 * This token is either a "user" or "group" or "service" token (exact type is unknown)
 */
interface UserGroupServiceMethod : UserGroupMethod, UserServiceMethod
