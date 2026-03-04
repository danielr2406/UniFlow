import sqlite3

def conectar_db():
    return sqlite3.connect("uniflow.db")

def crear_tablas():
    conn = conectar_db()
    cursor = conn.cursor()

    cursor.execute("""
    CREATE TABLE IF NOT EXISTS estudiantes (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        nombre TEXT NOT NULL,
        promedio REAL
    )
    """)
    
    conn.commit()
    conn.close()

def mensaje_bienvenida():
    print("==========================================")
    print("        Bienvenido a UniFlow")
    print(" Plataforma Inteligente de Gestión Académica")
    print("==========================================")
    print("Inicializando sistema...\n")

def main():
    mensaje_bienvenida()
    crear_tablas()
    print("Base de datos configurada correctamente.")
    print("Sistema listo para operar.")
