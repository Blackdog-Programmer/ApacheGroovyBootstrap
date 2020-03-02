def foo() {
    throw new Exception("Foo Exception")
}

List log = []
try {
    foo()
} catch (Exception e) {
    log << e.message
} finally {
    log << "finally called"
}

println log

// multi catch
try {
    
} catch( FileNotFoundException | NullPointerException e) {
    println e.class.name
    println e.message
}