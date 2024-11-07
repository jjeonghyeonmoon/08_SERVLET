<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>초라한 계산기 만들기</title>
    <style>
        .calculator {
            width: 300px;
            padding: 20px;
            margin: 50px auto;
            background-color: #f3f3f3;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
            text-align: center;
        }
        body {
            background: lightblue;
        }
    </style>
</head>
<body>
<div class="calculator">
    <h1>초라한 계산기 v2...</h1>
    <form action="calculator" method="get">
        <strong><label>첫 번째 숫자: </label></strong><input type="number" step="any" name="number1">
        <br><br>
        <strong><label>두 번째 숫자: </label></strong><input type="number" step="any" name="number2">
        <br><br>
        <h4>부호:
            <select name="sign">
                <option value="add">+</option>
                <option value="minus">-</option>
                <option value="multiplication">*</option>
                <option value="division">/</option>
            </select>
        </h4>
        <br>
        <input type="submit" value="계산">
    </form>
</div>
</body>
</html>
