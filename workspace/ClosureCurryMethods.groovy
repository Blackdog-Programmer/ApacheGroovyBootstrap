// curry
def log = { String type, Date createdOn, String msg ->
    println "$createdOn [$type] - $msg"
}
log("DEBUG", new Date(), "This is first debug msg")

def debugLog = log.curry("DEBUG")
debugLog(new Date(), "This is second debug msg")

def todayDebugLog = log.curry("DEBUG", new Date())
todayDebugLog("This is third debug msg")

// right curry
def crazyPersonLog = log.rcurry("This is fourth debug msg")
crazyPersonLog("ERROR", new Date())

// index based curry
def typeMsgLog = log.ncurry(1, new Date())
typeMsgLog("ALERT", "This is fifth debug msg")