/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import javax.ejb.Stateless;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.QueryParam;

@Stateless
@Path("/calcular")
public class CalculoITBMS {
    @GET
    @Produces("text/html")
    public String itbms(@QueryParam("base") double base)
    {
        
        try
        {
            double resultado = $itbms(base);
            String resultadofinal = "";
            if(resultado > 0)
            {
                resultadofinal = String.valueOf(resultado);
                return resultadofinal;
            }
            return "Número negativo";
        }
        catch(Exception n)
        {
            return "error en la operacion";
        }
        
                
    }
    
    double $itbms(double base)
    {
        double resultado = 0;
        resultado = base * 0.07;
        return resultado;
    }
}
