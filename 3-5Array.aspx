<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="3-5Array.aspx.cs" Inherits="WebApplication1.WebForm2" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <script type="text/javascript">

        var myArray = new Array(3);

        for (var i = 0; i < 3; i++)
        {
            myArray[i] = new Array(5);
        }

        var start = 100;

        for (var i = 0; i < 3; i++)
        {
            for (var j = 0; j < 5; j++)
            {
                myArray[i][j] = start;
                start = start + 1;
            }
        }

        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 5; j++) {
                document.write(myArray[i][j] + "&emsp;");
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
