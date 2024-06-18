document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('sampleForm');

    form.addEventListener('submit', function (event) {
        if (!form.checkValidity()) {
            event.preventDefault();
            event.stopPropagation();
        }
        form.classList.add('was-validated');
    }, false);

    // Additional validation logic
    const password = document.getElementById('password');
    const phone = document.getElementById('phone');

    password.addEventListener('input', function () {
        const minLength = 8;
        if (password.value.length < minLength) {
            password.setCustomValidity('Password must be at least 8 characters long.');
        } else {
            password.setCustomValidity('');
        }
    });

    phone.addEventListener('input', function () {
        const phonePattern = /^[0-9]{10}$/;
        if (!phonePattern.test(phone.value)) {
            phone.setCustomValidity('Please enter a valid 10-digit phone number.');
        } else {
            phone.setCustomValidity('');
        }
    });

    // Dynamic interactions
    const hobbies = document.getElementsByName('hobbies');
    const bio = document.getElementById('bio');

    Array.from(hobbies).forEach(function (hobby) {
        hobby.addEventListener('change', function () {
            let selectedHobbies = Array.from(hobbies).filter(hobby => hobby.checked).map(hobby => hobby.value);
            bio.value = `${selectedHobbies.join(', ')}`;
        });
    });
});
