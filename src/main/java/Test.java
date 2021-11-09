import com.entity.ConEmp;
import com.entity.Emp;
import com.entity.PerEmp;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello");

        List<String> names = new ArrayList<String>();
       // Emp e = new Emp(1, "ravi");
        Emp e = new ConEmp(1, "ravi",10);
        print(e);
    }

    private static void print(Emp emp){
        ConEmp perEmp = (ConEmp) emp;
        System.out.println(perEmp);
    }
}
