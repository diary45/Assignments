function conct(arr1=[],arr2=[]){

    let res=[];
    l=Math.max(arr1.length,arr2.length);
    for(let i=0;i<l;i++){
        if(arr1.length!=0)
        res.unshift(arr1.shift());

        if(arr2.length!=0)
        res.unshift(arr2.shift());
    }
    if(arr1!=undefined){
        
        res.concat(arr1);
    }
    if(arr2!=undefined){
    res.concat(arr2);
    }
    return res.reverse();



}


console.log(conct([1,2,3],[4,5,6,10,11,12]));