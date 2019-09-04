package reactintl.provider

import reactintl.IntlConfig

typealias OptionalIntlConfig = IntlConfig /* Omit<IntlConfig, keyof typeof DEFAULT_INTL_CONFIG> & Partial<typeof DEFAULT_INTL_CONFIG> */
