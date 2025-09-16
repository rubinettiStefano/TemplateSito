@import com.generation.templatesito.model.dtos.CalcolatriceDto

@param Double res = null
@param CalcolatriceDto dto = null
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form method="post" action="/calcolatrice">
    <input type="number" name="num1"  placeholder="primo numero"/>
    <input type="number" name="num2"  placeholder="secondo numero"/>
    <input type="submit" name="operation" value="+">
    <input type="submit" name="operation" value="-">
    <input type="submit" name="operation" value="*">
    <input type="submit" name="operation" value="/">
</form>
@if(res!=null)
    <h2>RISULTATO: ${dto.getNum1()} ${dto.getOperation()} ${dto.getNum2()} = ${res}</h2>
@endif
</body>
</html>