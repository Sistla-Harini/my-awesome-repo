Action()
{

	web_set_sockets_option("SSL_VERSION", "TLS1.2");

	web_add_header("Upgrade-Insecure-Requests", 
		"1");

	web_url("demo.automationtesting.in", 
		"URL=http://demo.automationtesting.in/", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t12.inf", 
		"Mode=HTML", 
		LAST);

	web_add_auto_header("Sec-Fetch-Mode", 
		"no-cors");

	web_add_auto_header("Sec-Fetch-Site", 
		"none");

	web_url("merchants.json", 
		"URL=https://www.gstatic.com/autofill/weekly/merchants.json", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t13.inf", 
		"Mode=HTML", 
		LAST);

	web_revert_auto_header("Sec-Fetch-Mode");

	web_revert_auto_header("Sec-Fetch-Site");

	web_url("bins.json", 
		"URL=https://www.gstatic.com/autofill/hourly/bins.json", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t14.inf", 
		"Mode=HTML", 
		LAST);

	web_add_header("A-IM", 
		"x-bm,gzip");

	web_add_header("Sec-Fetch-Mode", 
		"no-cors");

	web_add_header("Sec-Fetch-Site", 
		"none");

	web_url("seed", 
		"URL=https://clientservices.googleapis.com/chrome-variations/seed?osname=win&channel=stable&milestone=79", 
		"Resource=0", 
		"Referer=", 
		"Snapshot=t15.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=https://clients1.google.com/tbproxy/af/query?q=Chc2LjEuMTcxNS4xNDQyL2VuIChHR0xMKRMZv72dPN_u0M8jLXhvEhkkFA==", "Referer=", ENDITEM, 
		LAST);

	web_add_header("Upgrade-Insecure-Requests", 
		"1");

	web_url("SignIn.html", 
		"URL=http://demo.automationtesting.in/SignIn.html", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://demo.automationtesting.in/", 
		"Snapshot=t16.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=https://clients1.google.com/tbproxy/af/query?q=Chc2LjEuMTcxNS4xNDQyL2VuIChHR0xMKRMZF54zW6UI8w4jLZFhlU4kIy01hlQcJBQ=", "Referer=", ENDITEM, 
		"Url=https://ssl.gstatic.com/safebrowsing/csd/client_model_v5_variation_0.pb", "Referer=", ENDITEM, 
		"Url=https://ssl.gstatic.com/safebrowsing/csd/client_model_v5_ext_variation_0.pb", "Referer=", ENDITEM, 
		"Url=https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/fonts/fontawesome-webfont.woff2?v=4.5.0", "Referer=https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css", ENDITEM, 
		LAST);

	web_add_header("Origin", 
		"http://demo.automationtesting.in");

	web_add_header("Sec-Fetch-Mode", 
		"cors");

	web_add_header("Sec-Fetch-Site", 
		"cross-site");

	web_url("usertable", 
		"URL=https://api.mlab.com/api/1/databases/userdetails/collections/usertable?apiKey=YEX0M2QMPd7JWJw_ipMB3a5gDddt4B_X", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://demo.automationtesting.in/SignIn.html", 
		"Snapshot=t17.inf", 
		"Mode=HTML", 
		LAST);

	web_add_header("Upgrade-Insecure-Requests", 
		"1");

	lr_think_time(24);

	web_url("Register.html", 
		"URL=http://demo.automationtesting.in/Register.html", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://demo.automationtesting.in/", 
		"Snapshot=t18.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=https://adservice.google.com/adsid/integrator.js?domain=demo.automationtesting.in", ENDITEM, 
		"Url=https://pagead2.googlesyndication.com/pagead/js/r20200109/r20190131/show_ads_impl_fy2019.js", ENDITEM, 
		"Url=https://adservice.google.co.in/adsid/integrator.js?domain=demo.automationtesting.in", ENDITEM, 
		"Url=https://www.googletagservices.com/activeview/js/current/osd.js?cb=%2Fr20100101", ENDITEM, 
		LAST);

	web_add_auto_header("X-Requested-With", 
		"XMLHttpRequest");

	web_url("Languages.json", 
		"URL=http://demo.automationtesting.in/Languages.json", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://demo.automationtesting.in/Register.html", 
		"Snapshot=t19.inf", 
		"Mode=HTML", 
		LAST);

	web_url("Skills.json", 
		"URL=http://demo.automationtesting.in/Skills.json", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://demo.automationtesting.in/Register.html", 
		"Snapshot=t20.inf", 
		"Mode=HTML", 
		LAST);

	web_revert_auto_header("X-Requested-With");

	web_add_auto_header("Origin", 
		"http://demo.automationtesting.in");

	web_add_auto_header("Sec-Fetch-Mode", 
		"cors");

	web_add_auto_header("Sec-Fetch-Site", 
		"cross-site");

	web_url("newtable", 
		"URL=https://api.mlab.com/api/1/databases/userdetails/collections/newtable?apiKey=YEX0M2QMPd7JWJw_ipMB3a5gDddt4B_X", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://demo.automationtesting.in/Register.html", 
		"Snapshot=t21.inf", 
		"Mode=HTML", 
		LAST);

	web_url("all", 
		"URL=https://restcountries.eu/rest/v1/all", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://demo.automationtesting.in/Register.html", 
		"Snapshot=t22.inf", 
		"Mode=HTML", 
		LAST);

	web_url("newtable_2", 
		"URL=https://api.mlab.com/api/1/databases/userdetails/collections/newtable?apiKey=YEX0M2QMPd7JWJw_ipMB3a5gDddt4B_X", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=http://demo.automationtesting.in/Register.html", 
		"Snapshot=t23.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=https://safebrowsing.googleapis.com/v4/threatListUpdates_fetch?$req="
		"Ch0KDGdvb2dsZWNocm9tZRINNzkuMC4zOTQ1LjExNxopCAUQARobCg0IBRAGGAEiAzAwMTABENfvBxoCGApATUTSIgQgASACKAEaKQgBEAEaGwoNCAEQBhgBIgMwMDEwARC09QYaAhgKcHZwpCIEIAEgAigBGikIAxABGhsKDQgDEAYYASIDMDAxMAEQqfQGGgIYCigpYaAiBCABIAIoARopCAcQARobCg0IBxAGGAEiAzAwMTABEKjaBhoCGAqe3b7xIgQgASACKAEaJwgBEAEaGQoNCAEQBhgBIgMwMDEwAxAUGgIYCgFXi7AiBCABIAIoAxooCAEQCBoaCg0IARAIGAEiAzAwMTAEEIkZGgIYCiS4oosiBCABIAIoBBonCAkQARoZCg0ICRAGGAEiAzAwMTAGEAIaAhgKr7vuFSIEIAEgAigGGigIDxABGhoKDQgPEAYYASIDMDAxMAEQ3R4aAhgKuT9uzyIEIAEgAigBGicIChAIGh"
		"kKDQgKEAgYASIDMDAxMAEQBRoCGAqjPgAuIgQgASACKAEaJwgJEAEaGQoNCAkQBhgBIgMwMDEwARAYGgIYCobvuSAiBCABIAIoARooCAgQARoaCg0ICBAGGAEiAzAwMTABEN4HGgIYCjKaCzwiBCABIAIoARooCA0QARoaCg0IDRAGGAEiAzAwMTABENBiGgIYCmSmJXIiBCABIAIoARopCA4QARobCg0IDhAGGAEiAzAwMTABEJ32AhoCGAqCUNXWIgQgASACKAEaKAgQEAEaGgoNCBAQBhgBIgMwMDEwARCVARoCGAojW6V-IgQgASACKAEiAggB&$ct=application/x-protobuf&key=AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw", "Referer=", ENDITEM, 
		LAST);

	return 0;
}