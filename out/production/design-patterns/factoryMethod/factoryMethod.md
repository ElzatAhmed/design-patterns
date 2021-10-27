```mermaid
classDiagram

class Factory{
	<<abstract>>
	+createProduct(String owner)*Product
	+registerProduct(product)*void
	+create(String owner)Product
}

class Product{
	<<abstract>>
	+use()*void
}

class IdCardFactory{
	+createProduct(String owner)Product
	+registerProduct(product)void
}

class IdCard{
	+use()void
}

Factory <|-- IdCardFactory
Factory o--> Product
Product <|-- IdCard
IdCardFactory o--> IdCard
```

