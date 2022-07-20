package behavioural.chainOfResponsibility

interface IChainable<TData, TResult> {
    fun setNext(chainable: IChainable<TData, TResult>)
    fun callNextChainElement(data: TData): TResult
}