# sales-devices-server
## О'б
1. Запустить консоль
2. Выбрать удобный каталог и перейти в него
3. Клонировать проект - выполнить: git clone https://github.com/croacker/sales-device-server
4. Перейти в каталог проекта - выполнить: cd sales-device-server
5. Собрать и запустить - выполнить: mvn spring-boot:run
6. В браузере выполнить запрос по адресу http://127.0.0.1:8082/devices
будет отображен JSON-массив устройств.
> Алтернатива: curl -X GET http://127.0.0.1:8082/devices
7. В приложении выполняющем POST-запросы, выполнить запрос по адресу http://127.0.0.1:8082/devices, с телом '{"name":"Aura-6900","configuration":"serial://rs.232.true.1990"}'
тело можно модифицировать.
> Алтернатива: curl -H "Content-Type: application/json" -X POST -d '{"name":"Aura-6900","configuration":"serial://rs.232.true.1990"}' http://127.0.0.1:8082/devices
8. Чтобы убедиться что устройство добавлено в список.
В браузере выполнить запрос по адресу http://127.0.0.1:8082/devices будет отображен JSON-массив устройств.
> Алтернатива: curl -X GET http://127.0.0.1:8082/devices
