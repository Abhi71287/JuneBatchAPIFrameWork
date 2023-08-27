package org.testing.trigger;

import java.io.IOException;

import org.testing.testScript.TC10_Get_All_Req_Extract_NameValue_Assignment3;
import org.testing.testScript.TC1_Post_Resquest;
import org.testing.testScript.TC2_Post_Request_with_random_id;
import org.testing.testScript.TC3_Get_All_Request;
import org.testing.testScript.TC4_Get_All_Req_Extract_IdValue;
import org.testing.testScript.TC6_PutRequest;
import org.testing.testScript.TC7_DeleteRequest;
import org.testing.testScript.TC8_PostRequestAssignment1;
import org.testing.testScript.TC9_Get_All_Request_Assignment2;
import org.testing.testScript.TC_5_Get_Particular_By_IdValue;

public class Runner {
	public static void main(String[] args) throws IOException {
//		TC1_Post_Resquest tc1= new TC1_Post_Resquest();
//		tc1.postReq();
//		TC2_Post_Request_with_random_id tc2= new TC2_Post_Request_with_random_id();
//		tc2.postReqWithRandomId();
//		TC3_Get_All_Request tc3 =new TC3_Get_All_Request();
//		tc3.getAll();
//		TC4_Get_All_Req_Extract_IdValue tc4= new TC4_Get_All_Req_Extract_IdValue();
//		tc4.getAllExtractIdValue();
//		TC_5_Get_Particular_By_IdValue tc5= new TC_5_Get_Particular_By_IdValue();
//		tc5.getparticularByIdValue();
//		TC6_PutRequest tc6 = new TC6_PutRequest();
//		tc6.putRequest();
//		TC7_DeleteRequest tc7= new TC7_DeleteRequest();
//		tc7.deleteMethod();
		TC8_PostRequestAssignment1 tc8=new TC8_PostRequestAssignment1();
		tc8.postReqWithRandomName();
		TC9_Get_All_Request_Assignment2 tc9=new TC9_Get_All_Request_Assignment2();
		tc9.getAll();
		TC10_Get_All_Req_Extract_NameValue_Assignment3 tc10 = new TC10_Get_All_Req_Extract_NameValue_Assignment3();
		tc10.getAllExtractIdValue();
	}

}
