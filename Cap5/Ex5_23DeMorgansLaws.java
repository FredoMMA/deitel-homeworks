package Cap5;

public class Ex5_23DeMorgansLaws {

	public static void main(String[] args) {
		
		// De Morgan's Laws
		
		System.out.println("Letter A");
		System.out.println("BOTH TRUE");
		System.out.println();
		int x = 4;
		int y = 7;
		System.out.println("OLD");
		System.out.println(!(x < 5) && !(y >= 7));
		System.out.println("NEW");
		System.out.println(!((x < 5) || (y >= 7)));
		System.out.println();
		
		System.out.println("BOTH FALSE");
		System.out.println();
		x = 5;
		y = 5;
		System.out.println("OLD");
		System.out.println(!(x < 5) && !(y >= 7));
		System.out.println("NEW");
		System.out.println(!((x < 5) || (y >= 7)));
		System.out.println();
		
		System.out.println("X TRUE , Y FALSE");
		System.out.println();
		x = 4;
		y = 5;
		System.out.println("OLD");
		System.out.println(!(x < 5) && !(y >= 7));
		System.out.println("NEW");
		System.out.println(!((x < 5) || (y >= 7)));
		System.out.println();
		
		System.out.println("Y TRUE , X FALSE");
		System.out.println();
		x = 5;
		y = 7;
		System.out.println("OLD");
		System.out.println(!(x < 5) && !(y >= 7));
		System.out.println("NEW");
		System.out.println(!((x < 5) || (y >= 7)));
		System.out.println();
		System.out.println();
		
		System.out.println("Letter B");
		System.out.println("BOTH TRUE");
		System.out.println();
		int a = 4;
		int b = 4;
		int g = 7;
		System.out.println("OLD");
		System.out.println(!(a == b) || !(g != 5));
		System.out.println("NEW");
		System.out.println(!((a == b) && (g != 5)));
		System.out.println();
		
		System.out.println("BOTH FALSE");
		System.out.println();
		a = 4;
		b = 3;
		g = 5;
		System.out.println("OLD");
		System.out.println(!(a == b) || !(g != 5));
		System.out.println("NEW");
		System.out.println(!((a == b) && (g != 5)));
		System.out.println();
		
		System.out.println("A TRUE , G FALSE");
		System.out.println();
		a = 4;
		b = 4;
		g = 5;
		System.out.println("OLD");
		System.out.println(!(a == b) || !(g != 5));
		System.out.println("NEW");
		System.out.println(!((a == b) && (g != 5)));
		System.out.println();
		
		System.out.println("G TRUE , A FALSE");
		System.out.println();
		a = 4;
		b = 5;
		g = 7;
		System.out.println("OLD");
		System.out.println(!(a == b) || !(g != 5));
		System.out.println("NEW");
		System.out.println(!((a == b) && (g != 5)));
		System.out.println();
		System.out.println();
		
		System.out.println("Letter C");
		System.out.println("BOTH TRUE");
		System.out.println();
		x = 7;
		y = 7;
		System.out.println("OLD");
		System.out.println(!((x <= 8) && (y > 4)));
		System.out.println("NEW");
		System.out.println(!(x <= 8) || !(y > 4));
		System.out.println();
		
		System.out.println("BOTH FALSE");
		System.out.println();
		x = 9;
		y = 3;
		System.out.println("OLD");
		System.out.println(!((x <= 8) && (y > 4)));
		System.out.println("NEW");
		System.out.println(!(x <= 8) || !(y > 4));
		System.out.println();
		
		System.out.println("X TRUE , Y FALSE");
		System.out.println();
		x = 7;
		y = 3;
		System.out.println("OLD");
		System.out.println(!((x <= 8) && (y > 4)));
		System.out.println("NEW");
		System.out.println(!(x <= 8) || !(y > 4));
		System.out.println();
		
		System.out.println("Y TRUE , X FALSE");
		System.out.println();
		x = 9;
		y = 7;
		System.out.println("OLD");
		System.out.println(!((x <= 8) && (y > 4)));
		System.out.println("NEW");
		System.out.println(!(x <= 8) || !(y > 4));
		System.out.println();
		System.out.println();
		
		System.out.println("Letter D");
		System.out.println("BOTH TRUE");
		System.out.println();
		int i = 7;
		int j = 6;
		System.out.println("OLD");
		System.out.println(!((i > 4) || (j <= 6)));
		System.out.println("NEW");
		System.out.println(!(i > 4) && !(j <= 6));
		System.out.println();
		
		System.out.println("BOTH FALSE");
		System.out.println();
		i = 3;
		j = 7;
		System.out.println("OLD");
		System.out.println(!((i > 4) || (j <= 6)));
		System.out.println("NEW");
		System.out.println(!(i > 4) && !(j <= 6));
		System.out.println();
		
		System.out.println("I TRUE , J FALSE");
		System.out.println();
		i = 7;
		j = 7;
		System.out.println("OLD");
		System.out.println(!((i > 4) || (j <= 6)));
		System.out.println("NEW");
		System.out.println(!(i > 4) && !(j <= 6));
		System.out.println();
		
		System.out.println("J TRUE , I FALSE");
		System.out.println();
		i = 3;
		j = 6;
		System.out.println("OLD");
		System.out.println(!((i > 4) || (j <= 6)));
		System.out.println("NEW");
		System.out.println(!(i > 4) && !(j <= 6));
	}
}
