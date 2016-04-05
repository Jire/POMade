[![Build Status](https://travis-ci.org/Jire/POMade.svg?branch=master)](https://travis-ci.org/Jire/POMade) [![Kotlin](https://img.shields.io/badge/kotlin-1.0.1-blue.svg)](http://kotlinlang.org) [![license](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/Jire/POMade/blob/master/LICENSE) [![](https://jitpack.io/v/Jire/POMade.svg)](https://jitpack.io/#Jire/POMade)

##POMade
_Kotlin for you, Maven for them_

This library is licensed under [The MIT License](https://github.com/Jire/POMade/blob/master/LICENSE).

---

_POMade_ simplifies the build process without introducing complexity. _POMade_ uses existing Maven technology but provides you with a simple idiomatic syntax.

```kotlin
import org.jire.pomade.*

pomade("Your-Project"["1.0"] from "your.domain") {
    compile {
        "Some-Project"["1.5.0"] from "some.project.domain"
        "Another-Project"["1.2.3"] from "another.project.domain"
    }
}
```
