package com.caito.springsoap.client;

import com.caito.springsoap.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 * @author caito Vilas
 */

public class SoapClient extends WebServiceGatewaySupport {
    /**
     * metodo que devuelve la suma de 2 numeros
     * @param numeroA
     * @param numeroB
     * @return AddResponse
     */
    public AddResponse getAddResponse(int numeroA, int numeroB){
        Add add = new Add();
        add.setIntA(numeroA);
        add.setIntB(numeroB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Add");
        AddResponse addResponse = (AddResponse) getWebServiceTemplate().marshalSendAndReceive(
                "http://www.dneonline.com/calculator.asmx",
                add, soapActionCallback);
        return addResponse;
    }

    /**
     * metodo que devuelve la resta de 2 numeros
     * @param numeroA
     * @param numeroB
     * @return SubtrackResponse
     */

    public SubtractResponse getSubtractResponse(int numeroA, int numeroB){
        Subtract subtract = new Subtract();
        subtract.setIntA(numeroA);
        subtract.setIntB(numeroB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Subtract");
        SubtractResponse subtractResponse = (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive(
                "http://www.dneonline.com/calculator.asmx",
                subtract, soapActionCallback);
        return subtractResponse;
    }

    /**
     * metodo que devuelve la multiplicacion de 2 numeros
     * @param numeroA
     * @param numeroB
     * @return MultiplyResponse
     */
    public MultiplyResponse getMultiplyResponse(int numeroA, int numeroB){
        Multiply multiply = new Multiply();
        multiply.setIntA(numeroA);
        multiply.setIntB(numeroB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Multiply");
        MultiplyResponse multiplyResponse = (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive(
                "http://www.dneonline.com/calculator.asmx",
                multiply, soapActionCallback);
        return multiplyResponse;
    }

    /**
     *
     * @param numeroA
     * @param numeroB
     * @return DivideResponse
     */
    public DivideResponse getDivideResponse(int numeroA, int numeroB){
        Divide divide = new Divide();
        divide.setIntA(numeroA);
        divide.setIntB(numeroB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Divide");
        DivideResponse divideResponse = (DivideResponse) getWebServiceTemplate().marshalSendAndReceive(
                "http://www.dneonline.com/calculator.asmx",
                divide, soapActionCallback);
        return divideResponse;
    }
}
