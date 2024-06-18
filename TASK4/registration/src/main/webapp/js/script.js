function validateLoginForm() {
	var uname = document.getElementById("uname").value;
	var password = document.getElementById("password").value;

	if (uname === "" || password === "") {
		alert("Both fields are required.");
		return false;
	}

	var unamePattern = /^[a-zA-Z0-9_]+$/;
	if (!unamePattern.test(uname)) {
		alert("User name can only contain letters, numbers, and underscores.");
		return false;
	}

	return true;
}

function validateRegisterForm() {
	var uname = document.forms["registerForm"]["uname"].value;
	var password = document.forms["registerForm"]["password"].value;
	var email = document.forms["registerForm"]["email"].value;
	var phone = document.forms["registerForm"]["phone"].value;

	if (uname === "" || password === "" || email === "" || phone === "") {
		alert("All fields are required.");
		return false;
	}

	var unamePattern = /^[a-zA-Z0-9_]+$/;
	if (!unamePattern.test(uname)) {
		alert("User name can only contain letters, numbers, and underscores.");
		return false;
	}

	if (password.length < 6) {
		alert("Password must be at least 6 characters long.");
		return false;
	}

	var phonePattern = /^\d{10}$/;
	if (!phonePattern.test(phone)) {
		alert("Phone number must be exactly 10 digits.");
		return false;
	}

	return true;
}
