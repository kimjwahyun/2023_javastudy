package day16.com.ict.edu;

interface Animal{              // 반환형 있음
	public  void sound();
}
interface Animal2{             // 반환형 없음 return이 있음(받은쪽에서 System.out.println(); 해야한다)
	public String play();
}
class Dog implements Animal, Animal2{
	@Override
	public void sound() {
		System.out.println("멍~멍~");
	}
	@Override
	public String play() {
		return "꼬리잡기";
	}
	
}
class Cat{
	void music(Animal animal) {
		animal.sound();
	}
	void game(Animal2 animal2) {
		System.out.println(animal2.play()); // 실행될 때에는 String으로 반환해서 출력한다.
	}
}

public class Ex09_Anonymous {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		System.out.println(dog.play());
		System.out.println();
		
		
		Cat cat = new Cat();
		cat.music(new Animal() { // 객체생성 (내부클래스 만듬)
			@Override
			public void sound() {
				System.out.println("야옹~야옹~");
			}
			
		});
		cat.game(new Animal2() {
			@Override
			public String play() {
				return "그루밍";
			}
		});
	}
}
