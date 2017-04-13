/**
 * 管理员登录处理
 */

function checkForm(){
		
	$adminname=$("#adminName").val();
	$adminpwd=$("#adminPwd").val();
	if($adminname==null || $.trim($adminname) =="")
	{
		alert("用户名不能为空");
		return false;
	}				
	if($adminpwd==null || $.trim($adminpwd) =="")
	{
		alert("密码不能为空");
		return false;
	}	
	
	var flag = validate();
	if(!flag){
		alert("用户名和密码不对应");
		return false;				
	}
}
			
function validate(){
	var flag = false;
	var adminName = $("#adminName").val();
	var adminPwd = $("#adminPwd").val();
	$.ajax({
		type:"POST",
		url:"/smoms/admin/checkLogin.do",
		async:false,
		data:{
			'name':adminName,
			'pwd':adminPwd
		},
		dataType:'json',
		success:function(data){
			if(data.msg == "true"){
					flag = true;
					window.location.href='../admin/toIndex.do';
			}
		}
	})
	return flag;
}
			
	