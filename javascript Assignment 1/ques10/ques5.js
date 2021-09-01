function fib(count=1,x=1,y=1){
    if(count<=100){
        document.write(x+"<br>");
        // console.log(x+":"+count+"\n")
        count++;
        let temp=x+y;
        x=y;
        y=temp;
        fib(count,x,y);
    }
}

fib();