package reactintl.components.provider

import reactintl.IntlCache

typealias CreateIntlFn<T, C, S> = (config: C, cache: IntlCache?) -> S
