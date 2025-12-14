import React from 'react';

export default function NewTab() {
    const openNewTab = () => {
        window.open(window.location.href, '_blank', 'width=800,height=600');
    };

    const closeTab = () => {
        window.close();
    };

    return (
        <div style={{ position: 'fixed', top: 0, right: 0, display: 'flex', justifyContent: 'flex-end', zIndex: 1000 }}>
            <button onClick={openNewTab}>
                +
            </button>
            <button onClick={closeTab}>
                x
            </button>
        </div>
    );
}