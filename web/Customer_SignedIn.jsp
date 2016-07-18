<%-- 
    Document   : Example
    Created on : Jun 8, 2016, 2:54:15 PM
    Author     : Arko
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><title>
        STATEMENT
        </title>
        <style>
        header {
    
    background:#ffee58;
    -webkit-background-size: cover;
    -moz-background-size: cover;
    -o-background-size: cover;
    background-size: cover;
    -webkit-text-stroke: 1px #ffee58 ;
    
    padding:10px;
}
scroll{
    background:#1565c0 ;
    padding:5px;
    color:#fff59d;
}
nav {
    line-height:30px;
    width:540px;
    height:840px;
    background-color:#fff59d;
    padding:50px 680px 5px 120px;
}
.button {
	padding: 5px 10px;
	background: #2664cf;
	font-family: Arial, sans-serif;
	color: #ffffff;
	text-align: center;
	display: block;
	cursor: pointer
}
.button {
	border: 1px solid #4cadfc;
	border-radius: 4px;
	-webkit-border-radius: 4px;
	-moz-border-radius: 4px
	}
.button {
	background: -webkit-gradient(linear, left top, left bottom, from(#0a8ffe), to(#2b5cc6));
	background: -moz-linear-gradient(top, #0a8ffe, #2b5cc6);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#0a8ffe', endColorstr='#2b5cc6')
	}

.login{
    float:left;
    border-radius: 25px;
    background: #ffee58;
    padding: 60px 10px 15px 70px ; 
    width: 1000px;
    height: 650px; 
}

footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
    padding:5px;
}
    </style>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <header style="padding-top:5px;">
<span style="padding-left:0px;"><img src="icon.jpg" height="110" width="110"/>
<span style="position:absolute;padding-left:400px;padding-top:30px;">
<font face="impact" size=20px color="#2243B6">GROUPFUND BANK</font>
</span>
</header>
   
<scroll style="position:relative;padding-top:15px;">
<marquee>GROUPFUND UNCONSOLIDATED FINANCIAL RESULTS-14/06/2016.
</marquee>
</scroll>
     
    <nav>
        <font size="4px" >Hello ${select.name}</font><br>
        <br>
        <div class="login">
            <h1>Detailed bank statement </h1>
            <p>Account number: ${select.accountNumber}</p>
            <p>Date : <%= new java.util.Date() %></p> 
            <hr>
            <h4>Monthly Statement:</h4>
            <table border="1px" cellpadding="10">
                <tr>
                    <th>
                     Date   
                    </th>
                    <th>
                        Description
                    </th>
                    <th>
                        Balance
                    </th>
                </tr>
               
                <tr>
                    <td>
                       1/06/2016 
                    </td>
                    <td>
                      ---Beginning balance---
                    </td>
                    <td>
                        
                    </td>
                </tr>
                <tr>
                    <td>
                       7/06/2016 
                    </td>
                    <td>
                        Deduct EFT of utilities
                    </td>
                    <td>
                        109.07
                    </td>
                </tr>
                <tr>
                    <td>
                       9/06/2016 
                    </td>
                    <td>
                        NSF fee
                    </td>
                    <td>
                        437.06
                    </td>
                </tr>
                
                <tr>
                    <td>
                       10/06/2016 
                    </td>
                    <td>
                       Service charges
                        
                    </td>
                    <td>
                        30.0
                    </td>
                    
                </tr>
                 <tr>
                    <td>
                       13/06/2016 
                    </td>
                    <td>
                       
                        ---End Balance---
                    </td>
                    <td>
                        
                    </td>
                </tr>
                
            </table><br>
            
            CLOSING END BALANCE : Cash: ${select.cash}
        </div>
    </nav>
    <footer>
Copyright © GroupFund.com
</footer>    
</html>
