// Closure Scope
class ScopeDemo {
    def outerClosure = {
        println this.class.name // ScopeDemo
        println owner.class.name // ScopeDemo
        println delegate.class.name // ScopeDemo
        def nestedClosure = {
            println this.class.name // ScopeDemo
            println owner.class.name // ScopeDemo$_closure1
            println delegate.class.name // ScopeDemo$_closure1
        }
        nestedClosure()
    }
}
def demo = new ScopeDemo()
demo.outerClosure()


// deleagate and strategy
def writer = {
    append 'Liam Song'
    append 'lives in South Korea'
}
def append(String s) {
    println "append() called with argument of $s"
}
StringBuffer sb = new StringBuffer()
writer.resovleStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb
writer() // Liam Songlives in South Korea
