var n=parseInt(prompt());

for(let i=n,count=1;count<=20;i++){
    if((i%4==0 && i%100!=0) || i%400==0 ){
        count++
        document.write("<h2>"+i+"</h2><br>");
    }
}