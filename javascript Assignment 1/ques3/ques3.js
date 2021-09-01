function parity(k){
    if(k%2==0){
        return "even"
    }
    return "odd"
}

document.write(parity(parseInt(prompt())));