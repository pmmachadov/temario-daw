<#
.SYNOPSIS
Configura el ayudante de credenciales y recuerda los pasos para usar un PAT.

.DESCRIPTION
Este script establece `manager-core` como helper global y ofrece al usuario referencias para crear un PAT en GitHub.
También lanza el navegador apuntando a la página de tokens.
#>

Write-Host "Configurando credential helper manager-core..."
git config --global credential.helper manager-core

Write-Host "Abriendo la página de creación de tokens personales de GitHub..."
Start-Process https://github.com/settings/tokens

Write-Host "Cuando el token esté listo, ejecuta un `git push` y pega el token como contraseña."
Write-Host "Si necesitas más ayuda, revisa README o pide asistencia."