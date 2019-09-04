package reactintl

typealias LocaleData = Array<Locale>

typealias FormatDateOptions = CustomFormatConfig /* Exclude<Intl.DateTimeFormatOptions, 'localeMatcher'> & CustomFormatConfig= */
typealias FormatNumberOptions = CustomFormatConfig /* Exclude<Intl.NumberFormatOptions, 'localeMatcher'> & CustomFormatConfig */
typealias FormatRelativeTimeOptions = CustomFormatConfig /* Exclude<IntlRelativeTimeFormatOptions, 'localeMatcher'> & CustomFormatConfig */
typealias FormatPluralOptions = CustomFormatConfig /* Exclude<Intl.PluralRulesOptions, 'localeMatcher'> & CustomFormatConfig= */
