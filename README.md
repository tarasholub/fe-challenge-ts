# Тестове завдання TwinSpark frontend

Це приклад сайту на Clojure + TwinSpark (оригінал https://github.com/piranha/ecomspark) в який додано бекенд частину для сторінки зі списком брендів.

Твоє завдання - доробити фронтенд. Треба форкнути репозиторій, додати свої зміни і відправити нам посилання на результат.

1. Зверстати список брендів по [дизайну](https://www.figma.com/design/pCg4589UN9bPMfyixEUUEO/Kasta-TS-challenge?node-id=0-1&t=6uay2WUL0AMAfkn5-1). Верстка має бути адаптивною під мобільні пристрої та десктоп
2. Доробити нескінченну пагінацію на сторінці брендів (зараз відображаються тільки перші 10)
3. Зробити функціональною кнопку "Підписатись/Відписатись" (бекенд частина реалізована для API `/brand/add`)

Передбачається, що основна робота буде виконуватись в файлах:

- [src/ecomspark/views/brand.clj](src/ecomspark/views/brand.clj)
- [resources/public/static/brands.css](resources/public/static/brands.css)

Але не соромся дивитись на весь проект в пошуках прикладів.

## Як запустити?

- Встановити [Java 21](https://www.oracle.com/java/technologies/downloads/#java21)
- Встановити [Clojure](https://clojure.org/guides/install_clojure)
- Запустити `make`

Це запустить вебсервер на адресі http://localhost:5454/ з авторелоадом коду.

## Ресурси

- Синтаксис шаблонів Hiccup https://github.com/weavejester/hiccup/wiki/Syntax
- Документація по TwinSpark https://twinspark.js.org/
- Короткий відео огляд як працює TwinSpark
  - [Як працює TwinSpark](https://youtu.be/7fdMNKh6JYw?si=eqMdndTfCOtwvd0E)
  - [Як працює TwinSpark 2: екшени](https://youtu.be/psXagg717DE?si=jER2WVGav8LWKxb3)
- Есеї про htmx (інша бібліотека, такий же підхід) https://htmx.org/essays/
