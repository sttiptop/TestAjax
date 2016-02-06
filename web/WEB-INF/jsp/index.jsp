<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
    <title>Spring MVC Ajax example</title>
    <script type="text/JavaScript"
            src="${pageContext.request.contextPath}/resources/js/jquery-1.9.1.min.js">
    </script>

    <script type="text/javascript">
        function doAjax() {

            var inputText = $("#input_str").val();
            var inputTextA =$("#actionD").val();
            $.ajax({
                url : 'getKey',
                type: 'GET',
                dataType: 'json',
                contentType: 'application/json',
                mimeType: 'application/json',
                data : ({
                    text: inputText,
                    action: inputTextA
                }),
                success: function (data) {

                    var result = '"'+data.text+'",    '+data.count+' - ACTION';
                    $("#result_text").text(result);
                }
            });
        }
    </script>
</head>
<body>
<h3>Enter Key:</h3>
<input id="input_str" type="text">
<h3>Write action(on/off)</h3>
<input id="actionD" type="text">
<input type="button" value="OK" onclick="doAjax()">
<p id="result_text"></p>
</body>
</html>