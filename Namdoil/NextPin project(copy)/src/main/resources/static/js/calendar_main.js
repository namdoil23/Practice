document.addEventListener("DOMContentLoaded", function () {
    const calendar = document.getElementById('calendar');
    const currentMonthYear = document.getElementById('current-month-year');
    const prevButton = document.getElementById('prev');
    const nextButton = document.getElementById('next');
    const todayButton = document.getElementById('today');

    const calendarPanel = document.getElementById('calendar-panel');
    const panelTitle = document.getElementById('panel-title');
    const panelContent = document.getElementById('panel-content');
    const cardBody = document.querySelector('.card.card-body');

    const shareButton = document.getElementById('share-button');

    let date = new Date();
    date.setDate(1);
    let selectedDateElement = null;
    let todayDateElement = null;

    function renderCalendar() {
        calendar.innerHTML = '';
        const daysOfWeek = ['월', '화', '수', '목', '금', '토', '일'];
        for (let i = 0; i < daysOfWeek.length; i++) {
            const dayElement = document.createElement('div');
            dayElement.classList.add('header');
            dayElement.textContent = daysOfWeek[i];
            calendar.appendChild(dayElement);

            if (i === 5) {
                dayElement.classList.add('saturday');
            } else if (i === 6) {
                dayElement.classList.add('sunday');
            }
        }

        const month = date.getMonth();
        const year = date.getFullYear();

        currentMonthYear.textContent = `${year}.${(month + 1).toString().padStart(2, '0')}`;

        const firstDay = (date.getDay() + 6) % 7;
        const lastDate = new Date(year, month + 1, 0).getDate();
        const prevLastDate = new Date(year, month, 0).getDate();

        for (let i = 0; i < firstDay; i++) {
            const prevDateElement = document.createElement('div');
            prevDateElement.classList.add('day', 'prev-month');
            prevDateElement.textContent = prevLastDate - firstDay + i + 1;
            calendar.appendChild(prevDateElement);
        }

        const today = new Date();
        const todayDate = today.getDate();
        const todayMonth = today.getMonth();
        const todayYear = today.getFullYear();

        for (let day = 1; day <= lastDate; day++) {
            const dateElement = document.createElement('div');
            dateElement.classList.add('day');
            dateElement.textContent = day;
            calendar.appendChild(dateElement);

            const currentDayOfWeek = (firstDay + day - 1) % 7;

            if (currentDayOfWeek === 5) {
                dateElement.classList.add('saturday');
            } else if (currentDayOfWeek === 6) {
                dateElement.classList.add('sunday');
            }

            if (day === 27 && month == 6 && year == 2024 || day == 28 && month == 6 && year == 2024) {
                const userSchedule = document.createElement('div');
                userSchedule.textContent = "1박 2일 강릉여행";
                userSchedule.style.fontSize = "15px";
                userSchedule.style.background = "#7BD0FF";
                userSchedule.style.color = "#ffffff";
                userSchedule.style.marginTop = "15px";
                userSchedule.style.padding = "5px 0 5px 0";
                dateElement.classList.add('userSchedule');
                dateElement.appendChild(userSchedule);

                userSchedule.addEventListener("click", () => {
                    calendarPanel.style.display = 'block';
                });
            }

            if (day === todayDate && month === todayMonth && year === todayYear) {
                dateElement.style.border = "1px solid #007bff";
                todayDateElement = dateElement;
            }

            dateElement.addEventListener("mouseover", () => {
                dateElement.style.border = "1px solid #007bff";
            });

            dateElement.addEventListener("mouseout", () => {
                if (!(day === todayDate && month === todayMonth && year === todayYear) && dateElement !== selectedDateElement) {
                    dateElement.style.border = "1px solid #ddd";
                }
            });

            dateElement.addEventListener("click", () => {
                if (selectedDateElement && selectedDateElement !== dateElement) {
                    if (selectedDateElement === todayDateElement) {
                        todayDateElement.style.border = "1px solid #007bff";
                    } else {
                        selectedDateElement.style.border = "1px solid #ddd";
                    }
                }
                if (dateElement === todayDateElement) {
                    todayDateElement.style.border = "1px solid #FFC061";
                }
                else {
                    dateElement.style.border = "1px solid #FFC061";
                }
                selectedDateElement = dateElement;

                if (day === 27 && month == 6 && year == 2024) {
                    displayContent1();
                }
                else if (day == 28 && month == 6 && year == 2024) {
                    displayContent2();
                }
                else {
                    calendarPanel.style.display = 'none';
                }
            });
        }

        const totalCells = firstDay + lastDate;
        const nextMonthDays = (7 - (totalCells % 7)) % 7;

        for (let i = 1; i <= nextMonthDays; i++) {
            const nextDateElement = document.createElement('div');
            nextDateElement.classList.add('day', 'next-month');
            nextDateElement.textContent = i;
            calendar.appendChild(nextDateElement);
        }
    }

    // 1일차
    function displayContent1() {
        panelTitle.textContent = `1일차`;
        cardBody.innerHTML = '';

        const ul1 = document.createElement('ul');
        const items1 = ['당신의 안목 펜션', '송정해수욕장', '번패티번 강릉', '엔드 투 앤드 카페', '순두부젤라또 1호점', '차현희순두부청국장'];
        items1.forEach(item => {
            const li = document.createElement('li');
            li.textContent = item;

            // 특정 li에만 memo를 추가함
            if (item === '당신의 안목 펜션') {
                // memo 함수 호출
                memo(li, '12시 체크인');
            }
            if (item == '차현희순두부청국장') {
                memo(li, '20시 예약, 예약자명 오유빈');
            }

            ul1.appendChild(li);
        });
        cardBody.appendChild(ul1);
        panelContent.style.display = 'block';
    }

    // 2일차
    function displayContent2() {
        panelTitle.textContent = `2일차`;
        cardBody.innerHTML = '';

        const ul2 = document.createElement('ul');
        const items2 = ['아르떼뮤지엄 강릉', '카페덕덕', '이모네생선찜', '현대장칼국수', '스튜디오 킨조 소품샵'];
        items2.forEach(item => {
            const li = document.createElement('li');
            li.textContent = item;

            // 특정 li에만 memo를 추가함
            if (item === '이모네생선찜') {
                // memo 함수 호출
                memo(li, '13시 예약');
            }
            if (item == '스튜디오 킨조 소품샵') {
                memo(li, '18시 방문 예정');
            }

            ul2.appendChild(li);
        });
        cardBody.appendChild(ul2);
        panelContent.style.display = 'block';
    }

    // 특정 li에만 memo를 주는 함수
    function memo(li, text) {
        const memo = document.createElement('span');
        memo.classList.add('memo');

        const edit = document.createElement('img');
        edit.classList.add('edit');
        edit.src = 'images/edit_icon.png';
        memo.appendChild(edit);

        const memoText = document.createElement('span');
        memoText.textContent = text;
        memo.appendChild(memoText);

        li.appendChild(memo);

        // edit 아이콘을 클릭하면 발생하는 이벤트
        edit.addEventListener("click", function () {
            // memo를 수정하는 함수 호출
            editMemo(memoText);
        });
    }

    // memoText를 수정하는 함수
    function editMemo(memoText) {
        // 입력하는 input 생성
        const input = document.createElement('input');
        input.type = 'text';
        input.value = memoText.textContent;
        input.classList.add('memo-input');

        // saveButton 생성
        const saveButton = document.createElement('img');
        saveButton.src = 'images/save-icon.png';
        saveButton.alt = "save icon";
        saveButton.classList.add('save-button');

        // span -> input으로 변경하여 수정 가능하도록 만듦
        memoText.replaceWith(input);

        // 새로 생성된 input 요소에 포커스를 맞추어 사용자가 텍스트를 입력할 수 있게끔함
        input.focus();

        // input 요소 내의 모든 텍스트를 선택해 사용자가 텍스트를 입력할 때 
        // 기존 텍스트를 쉽게 대체할 수 있도록 함
        input.select();

        // input 바로 뒤에 saveButton 요소를 삽입
        input.after(saveButton);

        // saveButton 클릭 이벤트
        saveButton.addEventListener('click', function () {
            memoText.textContent = input.value;
            
            // input -> span으로 변경
            input.replaceWith(memoText);
            saveButton.remove();
        });

        // Enter를 눌러도 저장되게끔 이벤트 생성
        input.addEventListener('keyup', function (event) {
            if (event.key === 'Enter') {
                saveButton.click();
            }
        });

    }

    // 날씨 api 이용하기
    const apiKey = '4872637a8788d0b9b7a84adebed8aea5';
    const apiUrl = `http://api.openweathermap.org/data/2.5/forecast?q=Seoul&units=metric&appid=${apiKey}`;

    function fetchWeatherData() {
        fetch(apiUrl)
            .then(response => response.json())
            .then(data => {
                console.log("data1: " + data);
                renderWeatherData(data);
            })
            .catch(error => console.error('Error fetching weather data:', error));
    }

    // OpenWeatherMap 아이콘 코드와 Meteocons 아이콘 파일명을 매핑
    const iconMap = {
        '01d': '../images/weather_icons/clear-day.svg',
        '01n': '../images/weather_icons/clear-night.svg',
        '02d': '../images/weather_icons/partly-cloudy-day.svg',
        '02n': '../images/weather_icons/partly-cloudy-night.svg',
        '03d': '../images/weather_icons/cloudy.svg',
        '03n': '../images/weather_icons/cloudy.svg',
        '04d': '../images/weather_icons/cloudy.svg',
        '04n': '../images/weather_icons/cloudy.svg',
        '09d': '../images/weather_icons/rain.svg',
        '09n': '../images/weather_icons/rain.svg',
        '10d': '../images/weather_icons/rain.svg',
        '10n': '../images/weather_icons/rain.svg',
        '11d': '../images/weather_icons/thunderstorm.svg',
        '11n': '../images/weather_icons/thunderstorm.svg',
        '13d': '../images/weather_icons/snow.svg',
        '13n': '../images/weather_icons/snow.svg',
        '50d': '../images/weather_icons/fog.svg',
        '50n': '../images/weather_icons/fog.svg'
    };

    // 날씨 정보를 render 해주는 function
    function renderWeatherData(data) {
        console.log("data2: " + data);
        const today = new Date();
        const weatherData = data.list.filter((item) => {
            const forecastDate = new Date(item.dt * 1000);
            return forecastDate.getHours() === 12 && forecastDate >= today;
        }).slice(0, 5); // 앞으로의 5일간 날씨 데이터 선택

        weatherData.forEach((day, index) => {
            const weatherIcon = day.weather[0].icon;
            const tempMin = Math.round(day.main.temp_min);
            const tempMax = Math.round(day.main.temp_max);

            const dateElement = calendar.querySelectorAll('.day')[index + today.getDate() - 1];
            const weatherElement = document.createElement('div');
            const iconFileName = iconMap[weatherIcon] || 'weather_icons/default.svg'; // 매핑되지 않은 아이콘에 대한 기본값 설정
            weatherElement.innerHTML = `
            <img src="${iconFileName}" alt="Weather Icon">
            <div>${tempMax}°C / ${tempMin}°C</div>
        `;
            weatherElement.classList.add('weather');

            dateElement.appendChild(weatherElement);
        });
    }

    // ---------------- 버튼 클릭 이벤트들 ----------------
    
    // 저번 달로 넘어가는 버튼 클릭 이벤트
    prevButton.addEventListener('click', () => {
        date.setMonth(date.getMonth() - 1);
        renderCalendar();
    });

    // 다음 달로 넘어가는 버튼 클릭 이벤트
    nextButton.addEventListener('click', () => {
        date.setMonth(date.getMonth() + 1);
        renderCalendar();
    });

    // 오늘 날짜로 이동하는 버튼 클릭 이벤트
    todayButton.addEventListener('click', () => {
        date = new Date();
        date.setDate(1);
        renderCalendar();
        if (selectedDateElement) {
            selectedDateElement.style.border = "1px solid #007bff";
            selectedDateElement = null;
        }
        calendarPanel.style.display = 'none';
        fetchWeatherData();
    });

    // 다른 곳 클릭하면 calendarPanel 의 display를 block -> none으로 변경
    document.addEventListener("click", (event) => {
        const withinBoundaries = event.composedPath().includes(calendarPanel) || event.composedPath().includes(calendar);
        if (!withinBoundaries) {
            calendarPanel.style.display = 'none';
        }
    });

    // 공유하기 버튼 클릭 이벤트
    shareButton.addEventListener("click", () => {
        alert('공유하기 기능 넣기');
    });

    renderCalendar();
    fetchWeatherData();
});