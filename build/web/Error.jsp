<%-- 
    Document   : Error
    Created on : Jun 8, 2016, 8:25:31 PM
    Author     : Arko
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ERROR PAGE</title>
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
    width:620px;
    height:100vh;
    background-color:#fff59d;
    padding:5px 400px 5px;
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
    border-radius: 25px;
    background: #ffee58;
    padding: 30px 100px 15px 100px ; 
    width: 400px;
    height: 400px; 
}
footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
    padding:5px;
}
    </style>
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
        <br><br><br>
        <div class="login">
            <h1 style="color:blue; text-align:center;">
                Opps...Error Occured!!!
            </h1>
            <p style="font-size:20px;">Please go back to the respective<b> SIGN UP </b>page and give your correct details.</p>
            <center><br>
            <form action="sign_up_customer.html" method="post">
            
            <input type="submit" name="login" value="CUSTOMER" style="width:200px;" class="button">
            
            </form>   <br>     
        <form action="sign_up_admin.html" method="post">
            
            <input type="submit" name="login" value="AMINSTRATOR" style="width:200px;" class="button">
            
        </form>  <br>      
        <form action="sign_up_banker.html" method="post">
           
            <input type="submit" name="login" value="BANKER" style="width:200px;" class="button">
           
        </form>        
            </center>
        </div>
    </nav>
      

<footer>
Copyright © GroupFund.com
</footer>    
</html>
