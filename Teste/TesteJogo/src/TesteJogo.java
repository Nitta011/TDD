	import static org.junit.jupiter.api.Assertions.assertTrue;
	import org.junit.Assert;
	import org.junit.jupiter.api.Test;

	public class TesteJogo {
	    @Test
	    public void Testeequacao() {
	        int a = 3;
	        int b = 8;
	        int c = 4;
	        int d = 1;

	        System.out.println("2*D <  6");
	        Assert.assertTrue(2 * d < 6);

	        System.out.println("B*D <> 6");
	        Assert.assertTrue(b * d != 6);

	        System.out.println("B*D >  4");
	        Assert.assertTrue(b * d > 4);

	        System.out.println("C*D <> 6");
	        Assert.assertTrue(c * d != 6);
	    }
	}
	
	
	

