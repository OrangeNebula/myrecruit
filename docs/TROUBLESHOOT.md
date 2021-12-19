* 서브 모듈에서 의존성을 찾을 수 없는 에러가 발생할 때
  * 부모 모듈에서 subprojects 의존성이 제대로 설정이되어 있지 않아서 발생한 에러. subproject 에 dependencies 에 의존성을 추가함으로써 해결. 추가적으로 에러가 발생했는데, 마찬가지로 subprojects 에서 org.springframework.boot 플러그인을 apply 에 추가하여 해결.

* 서브모듈에서 kotest 를 사용할 수 없었을 때
  * build.gradle.kts 에서 allproject 에 설정되어 있던 Junit 관련 설정은 subproject 로 옮겨서 해결.
