import { ReactComponent as GithubIcon } from 'assets/img/Github.svg';
import './styles.css'

function Navbar() {

    return (
        <header>
            <nav className='container'>
                <div className='dsmovie-nav-content'>
                    <h1>Movie Review</h1>
                    <a href="github.com/srcabral">
                        <div className='dsmovie-contact-container'>
                            <GithubIcon />
                            <p className='dsmovie-contact-link'>/srcabral</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;