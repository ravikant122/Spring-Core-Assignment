function validate(){
    var isValid=true;
    var name=document.getElementById('name').value;
    var branch=document.getElementById('branch').value;
    var percentage=document.getElementById('percentage').value;
    
    if(isBlank(name)){
        document.getElementById('name').innerHTML="enter name";
        document.getElementById('name').style.color='red';

        isValid=false;
    }
    if(isBlank(branch)){
        document.getElementById('branch').innerHTML="enter branch";
        document.getElementById('branch').style.color='red';
        isValid=false;
    }
    if(isBlank(percentage)){
        document.getElementById('percentage').innerHTML="enter percentage";
        document.getElementById('percentage').style.color='red';
        isValid=false;
    }
    return isValid;
}
function isBlank(val){
    return (val=='')?true:false;
}
