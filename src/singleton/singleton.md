```mermaid
classDiagram

class Singleton{
	_singleton_:Singleton
	-Singleton()
	+getInstance()$Singleton
}

Singleton o--> Singleton
```

