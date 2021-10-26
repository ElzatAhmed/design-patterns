```mermaid
classDiagram

class Banner{
	string:String
	showWithAster()void
	showWithParen()void
}

class Print{
	<<interface>>
	printWeak()*void
	printStrong()*void
}

class PrintBanner{
	printWeak()void
	printStrong()void
}

Banner <|-- PrintBanner
Print <.. PrintBanner
```

