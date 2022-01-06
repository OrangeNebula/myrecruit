### 프로젝트 스토리
//TODO: 지현 20211107 스토리 작성시 어떻게 해야 하는지에 대해 기술하기



### 구현해야 할 스토리 리스트
* [x] 채용담당자는 포지션을 생성할 수 있다.
  * [x] JobPosition, Recruiter 엔티티를 작성한다.
  * [x] JobPosition 을 생성하는 유스케이스를 생성하고, 구현한다.
* [ ] 채용담당자는 포지션을 열고 닫을 수 있다.
  * [x] OpenPositionPort, ClosePositionPort 인터페이스 설계하기
  * [x] 포지션을 열 수 있는 서비스에 대한 포트, OpenPositionPort 추가
  * [x] 포지션을 닫을 수 있는 서비스에 대한 포트, ClosePositionPort 추가
  * [x] JobPositionRepository 추가, updatePositionPort 구현
  * [x] JobPosition 과 JobPositionEntity 를 연결하는 JobPositionMapper 구현
  * [ ] 채용담당자 번호를 받아서 포지션을 열 수 있는 서비스 구현
  * [ ] 채용담당자 번호를 받아서 포지션을 닫을 수 있는 서비스 구현
* [ ] 지원자는 포지션에 지원할 수 있다.
* [ ] 지원자는 지원한 포지션을 확인 할 수 있다.
* [ ] 채용담당자는 지원정보를 확인 할 수 있다.
* [ ] 채용담당자는 구성원을 평가자로 초대할 수 있다.
* [ ] 평가자는 지원정보를 확인 할 수 있다.
* [ ] 평가자는 지원에 대해 평가를 할 수 있다.
