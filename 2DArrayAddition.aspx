<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication1.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <script type="text/javascript"> 
        var myArray1 = new Array(3);

        for(var i=0; i<3; i++)
        {
            myArray1[i] = new Array(3);
        }

        var start = 1;

        for (var i = 0; i < 3; i++)
        {
            for (var j = 0; j < 3; j++)
            {
                myArray1[i][j] = start;
                start = start + 1;
            }
        }

        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 3; j++) {
                document.write(myArray1[i][j] + "&emsp;");
            }
            document.write("<br/>");
        }

        document.write("<br/>");
        document.write("&emsp;+");
        document.write("<br/>");
        document.write("<br/>");



        var myArray2 = new Array(3);

        for (var i = 0; i < 3; i++) {
            myArray2[i] = new Array(3);
        }

        var start = 9;

        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 3; j++) {
                myArray2[i][j] = start;
                start = start - 1;
            }
        }

        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 3; j++) {
                document.write(myArray2[i][j] + "&emsp;");
            }
            document.write("<br/>");
        }
        document.write("<br/>");
        document.write("&emsp;=");
        document.write("<br/>");
        document.write("<br/>");

        var myArray3 = new Array(3);

        for (var i = 0; i < 3; i++) {
            myArray3[i] = new Array(3);
        }



        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 3; j++) {
                myArray3[i][j] = myArray1[i][j] + myArray2[i][j];
            }
        }

        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 3; j++) {
                document.write(myArray3[i][j] + "&emsp;");
            }
            document.write("<br/>");
        }



    </script>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
    </div>
    </form>
</body>
</html>
