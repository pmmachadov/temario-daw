Custom UI — botones "Keep" en azul
=================================

Estos archivos (`custom.css` y `custom.js`) permiten cambiar el estilo de los pequeños botones "Keep" que aparecen en la barra flotante del editor.

Importante: este método no es oficial de VS Code. Requiere una extensión que permita cargar CSS/JS personalizados (por ejemplo `Custom CSS and JS Loader`). Puede dejar de funcionar tras actualizaciones de VS Code.

Pasos rápidos (Windows)
-----------------------
1. Copia la carpeta `\.vscode\custom-ui` a tu perfil de usuario para usar rutas permanentes:

```powershell
mkdir $env:USERPROFILE\.vscode\custom-ui -ErrorAction SilentlyContinue
Copy-Item -Path .\.vscode\custom-ui\* -Destination $env:USERPROFILE\.vscode\custom-ui -Recurse -Force
```

2. Instala la extensión (ejemplo):

```powershell
code --install-extension be5invis.vscode-custom-css
```

3. Abre `settings.json` (Ctrl+Shift+P → Preferences: Open Settings (JSON)) y añade:

```json
"vscode_custom_css.imports": [
  "file:///C:/Users/tu_usuario/.vscode/custom-ui/custom.css",
  "file:///C:/Users/tu_usuario/.vscode/custom-ui/custom.js"
]
```

Sustituye `tu_usuario` por tu nombre de usuario real y usa `file:///` con barras `/`.

4. Ejecuta el comando de la extensión para habilitar CSS/JS personalizado (Ctrl+Shift+P → "Enable Custom CSS and JS") y reinicia VS Code.

5. Si no ves cambios, ejecuta el comando de recarga que proporciona la extensión y reinicia otra vez.

Reversión
---------
- Quita la entrada `vscode_custom_css.imports` del `settings.json` y desactiva la extensión, luego reinicia VS Code.
- También puedes borrar `C:\Users\tu_usuario\.vscode\custom-ui`.

Personalización
---------------
- Cambia el color en `custom.css` alterando `#006ADC` por el hex que prefieras.
- Si la etiqueta no es exactamente "Keep", edita la comprobación en `custom.js` (por ejemplo usar `text.includes('Keep')`).

Limitaciones
-----------
- Método no soportado oficialmente.
- Puede requerir ajustes si VS Code cambia su DOM interno.
