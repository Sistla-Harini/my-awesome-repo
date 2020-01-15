Action4()
{

	web_add_header("Upgrade-Insecure-Requests", 
		"1");

	lr_think_time(97);

	web_url("Index.html", 
		"URL=http://demo.automationtesting.in/Index.html", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://demo.automationtesting.in/Register.html", 
		"Snapshot=t11.inf", 
		"Mode=HTML", 
		LAST);

	return 0;
}