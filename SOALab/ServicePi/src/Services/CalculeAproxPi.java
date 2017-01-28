package Services;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by theXuser on 29/11/2016.
 */
@WebService
public class CalculeAproxPi {

    @WebMethod
    public double calculer(int n){
        double result = 0;
        for (int i = 0; i <= n; i++){
            result += Math.pow(-1, i) / (2*i + 1);
        }

        return result;
    }
}
