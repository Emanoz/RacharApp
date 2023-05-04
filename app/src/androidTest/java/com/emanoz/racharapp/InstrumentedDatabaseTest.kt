package com.emanoz.racharapp

import androidx.room.Room
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.emanoz.racharapp.data.AppDatabase
import com.emanoz.racharapp.data.local.dao.UsuarioDao
import com.emanoz.racharapp.data.local.entities.UsuarioEntity
import kotlinx.coroutines.test.runTest
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.After

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import java.io.IOException

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class InstrumentedDatabaseTest {
    private lateinit var usuarioDao: UsuarioDao
    private lateinit var db: AppDatabase

    @Before
    fun createDb() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        db = Room.inMemoryDatabaseBuilder(
            context, AppDatabase::class.java).build()
        usuarioDao = db.usuarioDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        if(db.isOpen)
            db.close()
    }

    @Test
    @Throws(Exception::class)
    fun shouldInsertUser() = runTest {
        val usuario = UsuarioEntity(1L, "Emanuel", "15997446383", "")
        usuarioDao.insert(usuario)
        val usuarioById = usuarioDao.getById(1L)
        assertThat(usuarioById, equalTo(usuario))
    }

    @Test
    @Throws(Exception::class)
    fun shouldUpdateUser() = runTest {
        val usuario = UsuarioEntity(1L, "Emanuel", "15997446383", "")
        usuarioDao.insert(usuario)

        val usuarioAtualizado = UsuarioEntity(1L, "Emanuel Martins", "15997446383", "")
        usuarioDao.update(usuarioAtualizado)

        val usuarioById = usuarioDao.getById(1)
        assertThat(usuarioById, equalTo(usuarioAtualizado))
    }

    @Test
    @Throws(Exception::class)
    fun shouldDeleteUser() = runTest {
        val usuario = UsuarioEntity(1L, "Emanuel", "15997446383", "")
        usuarioDao.insert(usuario)

        val usuarioById = usuarioDao.getById(1)
        assertThat(usuarioById, equalTo(usuario))

        usuarioDao.delete(usuario)
        val usuarioAfterDelete = usuarioDao.getById(1)
        assertThat(usuarioAfterDelete, equalTo(null))
    }
}