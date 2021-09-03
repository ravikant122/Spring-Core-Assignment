function validate(){
    var isValid=true;
    var username=document.getElementById('username').value;
    var password=document.getElementById('password').value;
    
    if(isBlank(username)){
        document.getElementById('username').innerHTML="enter username";
        document.getElementById('username').style.color='red';

        isValid=false;
    }
    if(isBlank(password)){
        document.getElementById('password').innerHTML="enter password";
        document.getElementById('password').style.color='red';
        isValid=false;
    }
    return isValid;
}
function isBlank(val){
    return (val=='')?true:false;
}
