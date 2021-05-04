< JavaScript_Study Day1 >

// Man 속성을 가진 객체 생성
function Man() {
	this.name = "Anonymous";
	this.gender = "Man";
	this.Run = function () {
		return this.name + " is Running. ";
	}
	this.Sleep = function () {
		return this.name + " is Sleeping. ";
	}
}

// SoccerPlayer 속성을 가진 객체 생성
function SoccerPlayer () {
	this.base = new Man();
	this.name = "Anonymous Soccer Player.";
	this.Run = function () {
		// overriding이 가능하다.
		return this.base.Run();
	}
	this.Pass = function () {
		return this.name+" is passing to other player!";
	}
};

// SoccerPlayer 의 원형은 Man 이다.
// SoccerPlayer 로 객체화한다.
SoccerPlayer.prototype = new Man();
var player = new SoccerPlayer();

player.name; //Anonymous Soccer Player. SoccerPlayer 객체의 이름이 출력된다.
player.gender; // Man 부모 클래스의 성별이 출력된다.
player.Run(); //Anonymous is Running. 원형의 메소드를 실행한다.
//player.Run() 는 부모 클래스의 함수를 호출하기 때문에 이름이 Anonymous Soccer Player가 아닌 Anonymous 이다.
player.Pass(); //Anonymous Soccer Player is passing to other player! 
player.Sleep(); //Anonymous Soccer Player is Sleeping.
//player.Pass();와 player.Sleep();은 자식클래스로 객체화 되었기 때문에,
//이름이 Anonymous Soccer Player이다.
