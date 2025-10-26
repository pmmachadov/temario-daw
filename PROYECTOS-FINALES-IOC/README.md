# 🎓 Proyectos Finales DAW - IOC

Recopilación de proyectos finales de estudiantes de Desarrollo de Aplicaciones Web (DAW) del Institut Obert de Catalunya (IOC) encontrados en GitHub.

---

## 📚 Índice de Proyectos

1. [BiciFood - Plataforma de Comida Sostenible](#1-bicifood---plataforma-de-comida-sostenible)
2. [HomeTraining - Plataforma de Entrenamiento](#2-hometraining---plataforma-de-entrenamiento)
3. [Modern Forniture - Tienda de Muebles](#3-modern-forniture---tienda-de-muebles)

---

## 1. BiciFood - Plataforma de Comida Sostenible

**🔗 Repositorio:** [https://github.com/bicifood/biciFood](https://github.com/bicifood/biciFood)

**📝 Descripción:**
Plataforma web de pedidos de comida a domicilio que se diferencia por su apuesta por la sostenibilidad y respeto al medio ambiente. Ofrece repartimiento exclusivamente con bicicletas para reducir la huella de carbono.

**🛠️ Tecnologías Utilizadas:**

- **Frontend:** HTML5, CSS3, JavaScript ES6+, Bootstrap 5.3.3, Bootstrap Icons
- **Backend:** MySQL (preparado para integración con PHP)
- **Mapas:** Leaflet.js para seguimiento en tiempo real
- **Diseño:** Mobile-first, responsive design
- **Tipografía:** Google Fonts (Lora)

**✨ Características Principales:**

- 🛒 Sistema de carrito de compra interactivo
- 🗺️ Seguimiento de repartidores en tiempo real con mapas
- 📱 Diseño responsive (móvil, tablet, desktop)
- 🔍 Barra de búsqueda en tiempo real
- 💳 Proceso de pago completo
- 📋 8 categorías de productos (Carns, Peixos, Amanides, Arròs i pasta, Postres, Begudes, Vins)
- 🍽️ Catálogo de 21 productos
- 🔐 Sistema de login/registro
- 👥 Página "Nosaltres" con información de la empresa
- 📞 Formulario de contacto

**📄 Páginas Implementadas:**

- Inicio (`index.html`)
- Categorías (`categories.html`)
- Detalle de producto (`detall_product.html`)
- Carrito (`cistella.html`)
- Login (`login.html`) / Registro (`registrat.html`)
- Perfil de usuario (`perfil.html`)
- Proceso de pago (`pagament.html`)
- Nosotros (`nosaltres.html`)
- Contacto (`contacte.html`)
- Resultados de búsqueda (`resultats_cerca.html`)

**🎨 Paleta de Colores:**

```css
--color-brown: #6b5a3e        /* Marrón principal */
--color-lightbrown: #f0e0b2   /* Marrón claro para fondos */
--color-green: #38761d        /* Verde para bicicletas */
```

**📊 Base de Datos:**

- Esquema completo en MySQL
- Gestión de usuarios (clientes, admins, repartidores)
- Sistema de pedidos y entregas
- Estados de pedido: PENDENT → PREPARANT → EN RUTA → LLIURADA

**🚀 Estado del Proyecto:** Versión 4.0 - En desarrollo

**📚 Documentación:** README.md completo con instrucciones de instalación

---

## 2. HomeTraining - Plataforma de Entrenamiento

**🔗 Repositorio:** [https://github.com/TirBaGo/HomeTraining](https://github.com/TirBaGo/HomeTraining)

**📝 Descripción:**
Aplicación web completa para la gestión de rutinas de entrenamiento en casa. Permite a los usuarios inscribirse en rutinas creadas por entrenadores, con un sistema completo de gestión para tres tipos de usuarios: clientes, entrenadores y administradores.

**🛠️ Tecnologías Utilizadas:**

- **Frontend:** HTML5, CSS3, JavaScript ES6+
- **Backend:** Java con Spring Framework + Hibernate ORM
- **Base de Datos:** MySQL
- **API:** RESTful con Axios para peticiones asíncronas
- **Servidor:** Apache Tomcat

**✨ Características Principales:**

- 👥 **3 Tipos de Usuarios:**

  - **Cliente:** Busca y se inscribe en rutinas
  - **Entrenador:** Crea y gestiona sus propias rutinas
  - **Administrador:** Gestión completa del sistema

- 📋 **Gestión de Rutinas:**

  - Crear rutinas con modalidad, accesorios, nivel, duración y precio
  - Modificar rutinas existentes
  - Eliminar rutinas
  - Buscar rutinas por múltiples criterios
  - Activar/desactivar rutinas

- ✅ **Sistema de Inscripciones:**

  - Inscripción a rutinas
  - Gestión de pagos
  - Visualización de inscripciones del usuario
  - Cancelación de inscripciones

- 💬 **Sistema de Comunicación:**

  - Envío de dudas (Dubte)
  - Reporte de bugs
  - Sugerencias (Suggeriment)

- 🔐 **Autenticación:**
  - Login/Registro
  - Recuperación de contraseña
  - Modificación de perfil de usuario y entrenador

**🗄️ Entidades Principales:**

- **Rutina:** Programa de entrenamiento (modalidad, accesorio, nivel, duración, precio, descripción)
- **Inscripció:** Relación usuario-rutina con gestión de pago
- **Usuari:** Información personal (cliente o entrenador)
- **Login:** Credenciales de acceso
- **Modalitat:** Tipos de entrenamiento
- **Accessori:** Equipamiento necesario
- **Dubte, Bug, Suggeriment:** Comunicaciones con el sistema

**📡 API REST Endpoints:**

```javascript
// Ejemplos de endpoints
GET / api / rutina / getRutines;
POST / api / rutina / addRutina;
PUT / api / rutina / modifyRutina;
DELETE / api / rutina / deleteRutina;

GET / api / inscripcio / getInscripcions;
POST / api / inscripcio / addInscripcio;
DELETE / api / inscripcio / deleteInscripcio;

POST / api / usuari / addUsuari;
PUT / api / usuari / modifyUsuari;
GET / api / usuari / getUsuaris;

POST / api / login / addLogin;
GET / api / login / getLogin;
DELETE / api / login / deleteLogin;
```

**💾 Estructura del Proyecto:**

```
HomeTraining/
├── src/main/java/
│   ├── dao/           # Data Access Objects
│   ├── service/       # Lógica de negocio
│   ├── model/         # Entidades JPA
│   └── controller/    # Controladores REST
├── src/main/webapp/
│   ├── js/           # Scripts JavaScript
│   ├── css/          # Estilos
│   └── web-pages/    # Páginas HTML
└── pom.xml           # Dependencias Maven
```

**🎯 Funcionalidades por Usuario:**

**Cliente:**

- Buscar rutinas por categoría, entrenador, accesorio, nivel, duración
- Ver detalles de rutinas
- Inscribirse en rutinas
- Ver y gestionar sus inscripciones
- Modificar su perfil
- Enviar dudas/sugerencias

**Entrenador:**

- Crear nuevas rutinas
- Ver y modificar sus rutinas
- Gestionar accesorios
- Modificar su perfil

**Administrador:**

- Crear rutinas para cualquier entrenador
- Añadir/eliminar accesorios
- Gestión completa del sistema

**🚀 Estado del Proyecto:** Proyecto M12 - Completado (Semestre 2021-22-S1)

**📚 Documentación:** README básico incluido

---

## 3. Modern Forniture - Tienda de Muebles

**🔗 Repositorio:** [https://github.com/ManuLG97/ProyectoFinalDawLaravelTiendaDeMuebles](https://github.com/ManuLG97/ProyectoFinalDawLaravelTiendaDeMuebles)

**� Descripción:**
Proyecto final del ciclo superior de DAW para el módulo M12. Tienda online completa de venta de muebles desarrollada con Laravel. Permite a los usuarios navegar por catálogos de productos, añadir artículos al carrito y realizar pedidos. Incluye panel de administración para gestión de productos.

**🛠️ Tecnologías Utilizadas:**

- **Framework:** Laravel (PHP)
- **Frontend:** Blade Templates, HTML5, CSS3
- **Base de Datos:** MySQL
- **Gestión de Assets:** Laravel Mix, Webpack
- **Autenticación:** Laravel Auth
- **Carrito:** Darryldecode/Cart Package

**✨ Características Principales:**

- 🛒 **Sistema de Carrito de Compra:**

  - Añadir/eliminar productos
  - Modificar cantidades
  - Cálculo automático de totales
  - Persistencia de carrito

- 👥 **Gestión de Usuarios:**

  - Registro e inicio de sesión
  - Roles: Usuario y Administrador
  - Perfil de usuario editable
  - Historial de pedidos

- 📦 **Gestión de Productos:**

  - Catálogo completo de muebles por categorías
  - Fichas detalladas con:
    - Nombre, marca, descripción
    - Dimensiones y volumen
    - Precio normal y con montaje
    - Galería de fotos (múltiples imágenes)
  - Sistema de ofertas
  - Marcador de productos frágiles
  - Control de stock

- 🏷️ **Categorías de Productos:**

  - Armarios
  - Camas
  - Cómodas
  - Escritorios
  - Estanterías
  - Lámparas
  - Librerías
  - Mesas
  - Sillas
  - Sillones
  - Sofás
  - Taburetes

- 🔍 **Búsqueda Avanzada:**

  - Búsqueda por nombre de producto
  - Búsqueda por tipo de mueble
  - Búsqueda por descripción
  - Filtrado por marca

- 📋 **Panel de Administración:**

  - Gestión completa de productos (CRUD)
  - Gestión de usuarios
  - Visualización de pedidos
  - Estadísticas de ventas
  - Añadir/editar/eliminar productos
  - Subida de imágenes de productos

- 🧾 **Sistema de Facturación:**

  - Generación de facturas
  - Detalles de pedido
  - Información de entrega
  - Datos de contacto

- 🚚 **Gestión de Transporte:**
  - Registro de distribuidores
  - Asignación de transportes
  - Seguimiento de entregas
  - Información de contacto del usuario

**🗄️ Estructura de Base de Datos:**

```sql
-- Tablas principales
usuarios              # Usuarios del sistema
productos             # Catálogo de muebles
roles                 # Roles de usuario (user/admin)
mobiliarias           # Empresas muebleras
distribuidors         # Empresas de distribución
facturas              # Facturas de compra
transports            # Gestión de transportes
photos                # Galería de fotos por producto
```

**📄 Funcionalidades por Rol:**

**Usuario Regular:**

- Navegar catálogo por categorías
- Ver detalles de productos con galería
- Buscar productos
- Añadir al carrito
- Realizar pedidos
- Ver facturas
- Gestionar perfil
- Ver novedades y ofertas

**Administrador:**

- Todas las funciones de usuario
- Añadir/editar/eliminar productos
- Subir imágenes de productos
- Gestionar usuarios
- Ver todas las facturas
- Gestionar stock
- Activar/desactivar ofertas
- Gestionar categorías

**🎨 Vistas Principales:**

- `home.blade.php` - Página de inicio
- `user_home.blade.php` - Dashboard usuario
- `admin_home.blade.php` - Dashboard admin
- `info_product.blade.php` - Detalle de producto
- `invoice.blade.php` - Factura
- `search.blade.php` - Resultados de búsqueda
- Vistas por categoría (armarios, camas, sofás, etc.)
- `novedades.blade.php` - Últimos productos añadidos
- `ofertas.blade.php` - Productos en oferta

**🔧 Arquitectura del Proyecto:**

```
ProyectoFinalDaw/
├── app/
│   ├── Http/Controllers/
│   │   ├── HomeController.php
│   │   ├── ProductoController.php
│   │   ├── AdminController.php
│   │   ├── CartController.php
│   │   └── FacturaController.php
│   ├── Models/
│   │   ├── User.php
│   │   ├── Producto.php
│   │   ├── Factura.php
│   │   ├── Mobiliaria.php
│   │   ├── Distribuidor.php
│   │   └── Transport.php
│   └── ...
├── database/
│   └── migrations/
│       ├── create_productos_table.php
│       ├── create_facturas_table.php
│       ├── create_roles_table.php
│       └── ...
├── resources/
│   ├── views/
│   │   ├── menu_products/  # Vistas por categoría
│   │   ├── products_admin/ # Vistas admin por categoría
│   │   ├── admin/          # Panel administrador
│   │   └── user/           # Panel usuario
│   ├── css/
│   └── js/
├── routes/
│   └── web.php
└── public/
    └── imagenes/           # Imágenes de productos
```

**🌟 Características Destacadas:**

1. **Gestión de Imágenes:** Sistema de galería múltiple por producto
2. **Sistema de Roles:** Middleware para proteger rutas de administración
3. **Carrito Persistente:** Mantiene productos en sesión
4. **Búsqueda Inteligente:** Búsqueda por múltiples campos
5. **Migraciones Completas:** Base de datos versionada
6. **Relaciones Eloquent:** Relaciones bien definidas entre modelos
7. **Validaciones:** Validación de formularios
8. **Precio Flexible:** Precio normal y con servicio de montaje

**🚀 Estado del Proyecto:** Completado (2020)

**👥 Equipo:** Desarrollado por 2 personas

**📚 Documentación:** README estándar de Laravel

---

## �📊 Comparativa de Proyectos

| Característica          | BiciFood                      | HomeTraining                 | Modern Forniture          |
| ----------------------- | ----------------------------- | ---------------------------- | ------------------------- |
| **Tipo**                | E-commerce                    | Plataforma de servicios      | E-commerce                |
| **Enfoque**             | Comida a domicilio sostenible | Entrenamiento personalizado  | Venta de muebles          |
| **Frontend**            | Bootstrap + Vanilla JS        | HTML/CSS + JS                | Blade Templates + CSS     |
| **Backend**             | MySQL (PHP preparado)         | Java Spring + Hibernate      | Laravel (PHP)             |
| **Framework**           | Ninguno (preparado)           | Spring Boot                  | Laravel                   |
| **Complejidad Backend** | Básico                        | Avanzado (REST API completa) | Intermedio (MVC completo) |
| **Base de Datos**       | Relacional simple             | Relacional compleja          | Relacional intermedia     |
| **ORM**                 | ⚠️ Preparado                  | ✅ Hibernate/JPA             | ✅ Eloquent               |
| **Integración Mapas**   | ✅ Leaflet.js                 | ❌                           | ❌                        |
| **API REST**            | ⚠️ Preparada                  | ✅ Implementada              | ⚠️ MVC tradicional        |
| **Autenticación**       | ✅ Frontend                   | ✅ Backend completo          | ✅ Laravel Auth           |
| **Roles de Usuario**    | Cliente/Admin/Repartidor      | Cliente/Entrenador/Admin     | Usuario/Admin             |
| **Sistema de Carrito**  | ✅ JavaScript                 | ❌                           | ✅ Package dedicado       |
| **Panel Admin**         | ⚠️ Preparado                  | ✅ Completo                  | ✅ Completo               |
| **Gestión de Imágenes** | ✅ Estáticas                  | ❌                           | ✅ Upload dinámico        |
| **Facturación**         | ⚠️ Preparada                  | ❌                           | ✅ Implementada           |
| **Búsqueda**            | ✅ En tiempo real             | ✅ Filtros                   | ✅ Por texto              |
| **Estado**              | En desarrollo (v4.0)          | Completado                   | Completado                |
| **Año**                 | 2025                          | 2021-22                      | 2020                      |

---

## 🎯 Análisis Técnico

### BiciFood - Fortalezas

- ✅ Diseño visual muy cuidado y profesional
- ✅ Excelente documentación (README completo)
- ✅ Integración de mapas en tiempo real
- ✅ Mobile-first design
- ✅ Estructura de carpetas bien organizada
- ✅ Paleta de colores coherente con la temática sostenible

### BiciFood - Áreas de Mejora

- ⚠️ Backend no implementado (solo preparado)
- ⚠️ Sin autenticación real (solo frontend)
- ⚠️ Falta integración de pasarelas de pago reales

### HomeTraining - Fortalezas

- ✅ Backend completo con Spring + Hibernate
- ✅ API REST bien estructurada
- ✅ Gestión completa de roles y permisos
- ✅ Sistema de comunicación (dudas/bugs/sugerencias)
- ✅ CRUD completo para todas las entidades
- ✅ Validaciones tanto frontend como backend

### HomeTraining - Áreas de Mejora

- ⚠️ Diseño visual más básico
- ⚠️ Documentación limitada
- ⚠️ Sin seguimiento en tiempo real
- ⚠️ Interfaz menos pulida

### Modern Forniture - Fortalezas

- ✅ Framework Laravel completo y bien estructurado
- ✅ Sistema de roles con middleware
- ✅ Gestión de imágenes dinámica (upload)
- ✅ Sistema de facturación implementado
- ✅ Panel de administración funcional
- ✅ ORM Eloquent con relaciones bien definidas
- ✅ Múltiples categorías bien organizadas
- ✅ Sistema de carrito con package dedicado

### Modern Forniture - Áreas de Mejora

- ⚠️ Diseño visual básico (sin framework CSS moderno)
- ⚠️ Documentación mínima
- ⚠️ Sin pasarela de pago real
- ⚠️ Sin API REST (MVC tradicional)
- ⚠️ Código podría estar más actualizado (2020)

---

## 💡 Conclusiones y Aprendizajes

### Para tu Proyecto Final

**Si priorizas el Frontend:**

- Inspírate en **BiciFood** para:
  - Diseño responsive profesional
  - Integración de librerías (Bootstrap, Leaflet)
  - Experiencia de usuario cuidada
  - Documentación exhaustiva

**Si priorizas el Backend con Java:**

- Inspírate en **HomeTraining** para:
  - Arquitectura REST API
  - Gestión de roles y permisos
  - Persistencia con Hibernate/JPA
  - Operaciones CRUD completas

**Si priorizas el Backend con PHP:**

- Inspírate en **Modern Forniture** para:
  - Framework Laravel MVC
  - Eloquent ORM y relaciones
  - Sistema de autenticación
  - Panel de administración
  - Gestión de archivos/imágenes

**Proyecto Completo Ideal:**

- Combina el diseño visual de **BiciFood**
- Con la arquitectura API de **HomeTraining**
- Y las características de Laravel de **Modern Forniture**
- Añade funcionalidades modernas (PWA, WebSockets, etc.)

---

## 📌 Recursos Adicionales

### Otros Repositorios de Estudiantes IOC Encontrados

- `gmersi/prjava01` - Ejercicios M08 DAW IOC Java
- `albertvallsbe/Daw_IOC_Java_EAC8` - EACs de Java
- `josepfaneca/DAW_M07B1_22_23` - M07 Desarrollo servidor
- `masvidal778/eaf1M09IOC` - M09 Interfaces web

### Tecnologías Recomendadas para Proyectos DAW

- **Frontend:** React/Vue.js, Bootstrap/Tailwind
- **Backend:** Spring Boot (Java), Laravel (PHP), Express (Node.js)
- **BBDD:** MySQL/PostgreSQL, MongoDB
- **Despliegue:** Docker, Heroku, Vercel, Railway

---

## 🤝 Contribuir

Si conoces más proyectos finales de DAW-IOC interesantes, puedes:

1. Añadirlos a este documento
2. Crear un issue o pull request
3. Compartir el enlace al repositorio

---

**Última actualización:** 26 de octubre de 2025

**Recopilado por:** Asistente GitHub Copilot
