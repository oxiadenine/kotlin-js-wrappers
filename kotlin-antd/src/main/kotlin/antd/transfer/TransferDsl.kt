package antd.transfer

import react.*

inline fun <T, reified TC : TransferComponent<T>> RBuilder.transfer(noinline handler: RHandler<TransferProps<T>>) = child(TC::class, handler)
