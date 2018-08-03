#### 17、责任链模式（Chain of Responsibility）
有多个对象，每个对象持有下一个对象的引用，形成一条链，请求在这条链上传递，直到某个对象决定处理这个请求，
但请求的发出者不知道这条链上的哪个对象处理的该请求，责任链模式可以实现在隐瞒客户端的情况下对系统进行动态调整

> 此处强调一点就是，链接上的请求可以是一条链，可以是一个树，还可以是一个环，模式本身不约束这个，需要我们自己去实现，同时，在一个时刻，命令只允许由一个对象传给另一个对象，而不允许传给多个对象。