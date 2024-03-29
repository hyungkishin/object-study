### 설계 트레이오프
- 객체지향 커뮤니티에서는 오랜 기간 동안 좋은 설계의 특징을 판단할 수 있는 기준에 관한 다양한 논의가 있어 왔다. <br/>
- 데이터 중심 설계와 책임 중심 설계의 장단점을 비교하기 위해 캡슐화, 응집도, 결합도 를 사용해보자. <br/>

### 캡슐화
- 상태와 행동을 하나의 객체 안에 모으는 이유는 객체의 내부구현을 외부로부터 감추기 위해서다. <br/>
- 구현이란, 나중에 변경될 가능성이 높은 어떤 것을 가리킨다. <br/>
- 객체지향이 강력한 이유는 한 곳에서 일어난 변경이 전체 시스템에 영향을 끼치지 않도록 파급효과를 적절하게 조절할 수 있는 장치를 제공하기 때문이다. <br/>
- 객체를 사용하면 변경 가능성이 높은 부분은 내부에 숨기고 외부에는 상대적으로 안정적인 부분만 공개함으로써 변경의 여파를 통제할 수 있다. <br/>
- 변경될 가능성이 높은 부분을 구현이라고 부르고 상대적으로 안정적인 부분을 인터페이스 라고 부른다. <br/>
- 객체지향에서 가장 중요한 원리는 캡슐화 다. <br/>

> 복잡성 을 다루기 위한 가장 효과적인 도구는 = 추상화 <br/>
> 다양한 추상화 유형을 사용할 수 있지만 객체지향 프로그래밍에서 복잡성 취급하는 주요한 추상화 방법은 = 캡슐화. <br/>
